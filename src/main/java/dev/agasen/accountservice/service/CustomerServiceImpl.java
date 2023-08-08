package dev.agasen.accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.agasen.accountservice.exceptions.CustomerNotFoundException;
import dev.agasen.accountservice.model.Customer;
import dev.agasen.accountservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

  @Autowired private CustomerRepository customerRepository;

  public Customer getCustomer(Long customerNo) {
    return customerRepository.findById(customerNo).orElseThrow(CustomerNotFoundException::new);
  }

}
