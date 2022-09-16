package com.muhammadusman92.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
