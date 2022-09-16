package com.muhammadusman92.userservice.dto;

import com.muhammadusman92.userservice.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
