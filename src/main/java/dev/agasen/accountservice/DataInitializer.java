package dev.agasen.accountservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.agasen.accountservice.service.CustomerService;

@Component
public class DataInitializer implements CommandLineRunner {

  @Autowired private CustomerService customerService;

  public void run(String... args) throws Exception {    
  
  
  }
  
}
