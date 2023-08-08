package dev.agasen.accountservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.agasen.accountservice.model.Account;
import dev.agasen.accountservice.model.AccountType;
import dev.agasen.accountservice.model.Customer;
import dev.agasen.accountservice.repository.CustomerRepository;
import dev.agasen.accountservice.service.CustomerService;

@Component
public class DataInitializer implements CommandLineRunner {

  @Autowired private CustomerRepository customerRepository;

  public void run(String... args) throws Exception {    
    // save test data
    Customer c = new Customer();
    c.setName("Test");
    c.setEmail("test12345@gmail.com");
    c.setMobileNo("09081234567");
    c.setPrimaryAddress("test");
    c.setSecondaryAddress("test");

    // add one saving
    Account saving = new Account();
    saving.setAccountNo(10001L);
    saving.setAccountType(AccountType.SAVINGS);
    saving.setAvailableBalance(new BigDecimal("500.00"));
    c.addAccount(saving);

    // id of saved customer will be 1
    customerRepository.save(c);
  }
 
}
