package com.muhammadusman92.department.repo;

import com.muhammadusman92.department.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
}
