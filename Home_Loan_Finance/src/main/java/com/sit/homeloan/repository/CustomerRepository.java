package com.sit.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sit.homeloan.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
