package dev.agasen.accountservice.service;

import dev.agasen.accountservice.model.Customer;

public interface CustomerService {
  Customer getCustomer(Long customerNo);
}
