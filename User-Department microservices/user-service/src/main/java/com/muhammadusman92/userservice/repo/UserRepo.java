package com.muhammadusman92.userservice.repo;

import com.muhammadusman92.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
