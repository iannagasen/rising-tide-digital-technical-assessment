package dev.agasen.accountservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import dev.agasen.accountservice.constants.ResponseCodes;
import dev.agasen.accountservice.constants.ResponseValues;
import dev.agasen.accountservice.dto.CreateCustomerRequest;
import dev.agasen.accountservice.dto.CreateCustomerResponse;
import dev.agasen.accountservice.dto.ReadCustomerResponse;
import dev.agasen.accountservice.exceptions.CustomerNotFoundException;
import dev.agasen.accountservice.model.Customer;
import dev.agasen.accountservice.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/v1/account")
public class CustomerController {

  @Autowired private CustomerService customerService;

  @PostMapping
  public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest request) {

    return null;
  }

  @GetMapping("/{customerNumber}")
  public ResponseEntity<ReadCustomerResponse> getCustomer(@PathVariable Long customerNumber) {
    try {
      Customer customer = customerService.getCustomer(customerNumber);
      ReadCustomerResponse res = ReadCustomerResponse.asSuccessful(customer, ResponseCodes.FOUND, ResponseValues.CUSTOMER_FOUND);
      return ResponseEntity.status(HttpStatus.FOUND).body(res);
    } catch (CustomerNotFoundException e) {
      ReadCustomerResponse res = ReadCustomerResponse.asFailed(ResponseCodes.NOT_FOUND, ResponseValues.CUSTOMER_NOT_FOUND);
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(res);
    }
  }
  

}
