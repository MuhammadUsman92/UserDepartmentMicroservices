package com.muhammadusman92.userservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.muhammadusman92.userservice.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResponseDto {
    private User user;
    private DepartmentDto department;
    private String error;

    public ResponseDto(User user, DepartmentDto department) {
        this.user = user;
        this.department = department;
    }

    public ResponseDto(String error) {
        this.error = error;
    }
}
