package com.example.hw29;
import java.util.Collection;
public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee findEmployee(String firstName, String lastName);
    void removeEmployee(String firstName, String lastName);

    Collection<Employee> allEmployee();
}