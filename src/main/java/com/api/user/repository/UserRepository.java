package com.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	boolean existsByEmail(String email);
}
