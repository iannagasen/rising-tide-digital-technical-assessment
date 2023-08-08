package dev.agasen.accountservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import dev.agasen.accountservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
  
}
