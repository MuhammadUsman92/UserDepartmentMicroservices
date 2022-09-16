package com.muhammadusman92.department.services.impl;

import com.muhammadusman92.department.entities.Department;
import com.muhammadusman92.department.repo.DepartmentRepo;
import com.muhammadusman92.department.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public Department findDepartmentById(Long departmentId) {
        return departmentRepo.findById(departmentId).orElse(new Department(-1l, "null","null","null"));
    }
}
