package com.example.hw29;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
public class DeptController {
    private final DeptService deptService;

    public DeptController(DeptService deptService) {
        this.deptService = deptService;
    }
    @GetMapping(path = "/departments/max-salary")
    public Employee maxSalary(@RequestParam Integer dept){
        return deptService.maxSalary(dept);
    }
    @GetMapping(path = "/departments/min-salary")
    public Employee minSalary(@RequestParam Integer dept){
        return  deptService.minSalary(dept);
    }
    @GetMapping(path = "/departments/all",params = "dept")
    public Collection<Employee> allDept(@RequestParam Integer dept){
        return deptService.allDept(dept);
    }
    @GetMapping(path = "/departments/all")
    public Map<Integer, List<Employee>> allEmployeesByDept(){
        return deptService.allEmployeesByDept();
    }
}
