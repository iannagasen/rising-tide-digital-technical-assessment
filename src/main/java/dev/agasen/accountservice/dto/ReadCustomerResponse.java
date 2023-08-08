package dev.agasen.accountservice.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import dev.agasen.accountservice.model.Account;
import dev.agasen.accountservice.model.Customer;

@JsonInclude(Include.NON_NULL)
public class ReadCustomerResponse {
  private String customerNumber;
  private String customerName;
  private String customerMobile;
  private String address1;
  private String address2;
  private List<AccountDTO> savings;

  private int transactionStatusCode;
  private String transactionStatusDescription;
  
  private static ReadCustomerResponse fromEntity(Customer customer) {
    ReadCustomerResponse res = new ReadCustomerResponse();
    res.setCustomerNumber(customer.getCustomerNo());
    res.setCustomerMobile(customer.getMobileNo());
    res.setCustomerName(customer.getName());
    res.setAddress1(customer.getPrimaryAddress());
    res.setAddress2(customer.getSecondaryAddress());
    
    List<AccountDTO> savings = customer.getAccounts().stream()
        .filter(Account::isSavingsAccount)
        .map(AccountDTO::fromEntity)
        .collect(Collectors.toList());
    
    res.setSavings(savings);

    return res;
  }

  public static ReadCustomerResponse asSuccessful(Customer customer, int transactionStatus, String transactionStatusDescription) {
    ReadCustomerResponse res = fromEntity(customer);
    res.setTransactionStatusCode(transactionStatus);
    res.setTransactionStatusDescription(transactionStatusDescription);
    return res;
  }

  public static ReadCustomerResponse asFailed(int transactionStatus, String transactionStatusDescription) {
    ReadCustomerResponse res = new ReadCustomerResponse();
    res.setTransactionStatusCode(transactionStatus);
    res.setTransactionStatusDescription(transactionStatusDescription);
    return res;
  }

  public ReadCustomerResponse() {}

  public String getCustomerNumber() {
    return customerNumber;
  }
  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
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
  public List<AccountDTO> getSavings() {
    return savings;
  }
  public void setSavings(List<AccountDTO> savings) {
    this.savings = savings;
  }
  public int getTransactionStatusCode() {
    return transactionStatusCode;
  }
  public void setTransactionStatusCode(int transactionStatusCode) {
    this.transactionStatusCode = transactionStatusCode;
  }
  public String getTransactionStatusDescription() {
    return transactionStatusDescription;
  }
  public void setTransactionStatusDescription(String transactionStatusDescription) {
    this.transactionStatusDescription = transactionStatusDescription;
  }
}

