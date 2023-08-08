package dev.agasen.accountservice.service;

import dev.agasen.accountservice.model.Customer;

public interface CustomerService {
  Long postCustomer(Customer customer);
  Customer getCustomer(Long customerNo);
}
