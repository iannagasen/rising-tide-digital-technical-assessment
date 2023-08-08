package dev.agasen.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.agasen.accountservice.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
  
}
