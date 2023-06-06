package com.example.hw29;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DeptService {
    Employee maxSalary(Integer dept);

    Employee minSalary(Integer dept);

    Collection<Employee> allDept(Integer dept);

    Map<Integer, List<Employee>> allEmployeesByDept();
}