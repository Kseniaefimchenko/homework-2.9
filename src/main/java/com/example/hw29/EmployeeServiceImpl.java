package com.example.hw29;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private Map<String, Employee> employees = new HashMap<>();
    @Override
    public void addEmployee(Employee employee){
        if(!userVerification(employee.getFirstName(), employee.getLastName()))
            throw new CheckingForExceptions();

        if(employees.containsKey(employee.getFirstName() + employee.getLastName())){
            throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getFirstName() + employee.getLastName(), employee);
    }
    @Override
    public  Employee findEmployee(String firstName, String lastName){
        if(!userVerification(firstName,lastName))
            throw new CheckingForExceptions();

        if(!employees.containsKey(firstName + lastName)){
            throw new EmployeeNotFoundException();
        }
        return employees.get(firstName+lastName);
    }
    @Override
    public void removeEmployee(String firstName, String lastName){
        if(!userVerification(firstName,lastName))
            throw new CheckingForExceptions();

        if(!employees.containsKey(firstName+lastName)){
            throw new EmployeeNotFoundException();
        }
        employees.remove(firstName+lastName);
    }

    @Override
    public Collection<Employee> allEmployee() {
        return employees.values();
    }
    private boolean userVerification(String firstName, String lastName){
        return StringUtils.isAlpha(firstName) && StringUtils.isAlpha(lastName);
    }
}
