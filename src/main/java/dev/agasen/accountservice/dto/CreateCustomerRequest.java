package dev.agasen.accountservice.dto;

import dev.agasen.accountservice.model.Customer;

public class CreateCustomerRequest {
  private String customerName;
  private String customerMobile;
  private String customerEmail;
  private String address1;
  private String address2;

  public Customer toEntity() {
    Customer c = new Customer();
    c.setName(customerName);
    c.setMobileNo(customerMobile);
    c.setEmail(customerEmail);
    c.setPrimaryAddress(address1);
    c.setSecondaryAddress(address2);
    return c;
  }

  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public String getCustomerMobile() {
    return customerMobile;
  }
  public void setCustomerMobile(String customerMobile) {
    this.customerMobile = customerMobile;
  }
  public String getCustomerEmail() {
    return customerEmail;
  }
  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }
}