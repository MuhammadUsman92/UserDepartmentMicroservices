package com.muhammadusman92.department.services;

import com.muhammadusman92.department.entities.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department findDepartmentById(Long departmentId);
}
