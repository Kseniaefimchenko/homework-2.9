package com.example.hw29;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
public class Employee {
    private final String firstName;
    private final String lastName;
    private Integer dept;
    private Integer salary;

    public Employee(String firstName, String lastName, Integer dept, Integer salary) {
        this.firstName = StringUtils.capitalize(firstName.toLowerCase());
        this.lastName = StringUtils.capitalize(lastName.toLowerCase());
        this.dept = dept;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getDept() {
        return dept;
    }

    public Integer getSalary() {
        return salary;
    }
    public void setDept(Integer dept) {
        if (dept > 0) {
            this.dept = dept;
        }
    }
    public void setSalary(Integer salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dept == employee.dept && Double.compare(employee.salary, salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dept, salary);
    }
}