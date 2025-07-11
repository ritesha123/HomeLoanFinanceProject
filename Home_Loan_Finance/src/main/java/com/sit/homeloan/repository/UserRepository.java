package com.sit.homeloan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sit.homeloan.model.User;

import com.sit.homeloan.model.Role;



public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
	boolean existsByRole(Role role);
	
}
