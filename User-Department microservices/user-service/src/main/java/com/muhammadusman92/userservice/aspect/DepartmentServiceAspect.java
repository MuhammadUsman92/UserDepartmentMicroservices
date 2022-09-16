package com.muhammadusman92.userservice.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DepartmentServiceAspect {
//    @Pointcut("execution( com.muhammadusman92.department.services.DepartmentService.*(..)) and args(Department)")
//    public void saveDepartment(){
//    }
    @Before("within(com.muhammadusman92.userservice..*)")
    public void beforeLog(JoinPoint joinPoint){
        log.info("Before saveDepartment of "+joinPoint.getSignature());
    }
    @AfterReturning("within(com.muhammadusman92.userservice..*)")
    public void afterLog(JoinPoint joinPoint){
        log.info("After saveDepartment of "+joinPoint.getSignature());
    }
}
