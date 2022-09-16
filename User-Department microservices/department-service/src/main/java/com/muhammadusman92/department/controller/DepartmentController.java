package com.muhammadusman92.department.controller;

import com.muhammadusman92.department.entities.Department;
import com.muhammadusman92.department.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{departmentId}")
    public Department findDepartmentById(@PathVariable Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }
}
