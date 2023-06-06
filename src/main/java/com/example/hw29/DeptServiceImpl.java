package com.example.hw29;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DeptServiceImpl implements DeptService {
    private final EmployeeService employeeService;

    public DeptServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee maxSalary(Integer dept) {
        return employeeService.allEmployee().stream()
                .filter(e -> Objects.equals(e.getDept(), dept))
                .max(Comparator.comparingInt(e -> e.getSalary()))
                .orElseThrow(() -> new IllegalArgumentException("Сотрудника не существует"));
    }

    @Override
    public Employee minSalary(Integer dept) {
        return employeeService.allEmployee().stream()
                .filter(e -> Objects.equals(e.getDept(), dept))
                .min(Comparator.comparingInt(e -> e.getSalary()))
                .orElseThrow(() -> new IllegalArgumentException("Сотрудника не существует"));
    }

    @Override
    public Collection<Employee> allDept(Integer dept) {
        return employeeService.allEmployee().stream()
                .filter(e -> Objects.equals(e.getDept(),dept))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> allEmployeesByDept() {
        return employeeService.allEmployee().stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.toList()));
    }
}
