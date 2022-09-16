package com.muhammadusman92.userservice.services.impl;

import com.muhammadusman92.userservice.dto.DepartmentDto;
import com.muhammadusman92.userservice.dto.ResponseDto;
import com.muhammadusman92.userservice.entities.User;
import com.muhammadusman92.userservice.repo.UserRepo;
import com.muhammadusman92.userservice.services.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
    private static final String SERVICE_A = "serviceA";
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findUserById(Long userId) {
        return null;
    }

    @CircuitBreaker(name = SERVICE_A, fallbackMethod = "serviceAFallback")
    @Retry(name = SERVICE_A)
    @RateLimiter(name = SERVICE_A)
    @Override
    public ResponseDto getUserWithDepartment(Long userId) {
        User user=userRepo.findById(userId).orElse(new User(-1l,"null","null","null",-1l));
        DepartmentDto department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),DepartmentDto.class);
        return new ResponseDto(user,department);
    }

    public ResponseDto serviceAFallback(Exception e) {
        return new ResponseDto("Department Service is taking longer than Expected. Please try again later");
    }

}
