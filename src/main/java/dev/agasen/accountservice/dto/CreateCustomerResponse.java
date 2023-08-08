package dev.agasen.accountservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CreateCustomerResponse {

  private long customerNumber;
  private int transactionStatusCode;
  private String transactionStatusDescription;

  public static CreateCustomerResponse asSuccessful(long customerName, int transactionStatus, String transactionStatusDescription) {
    return new CreateCustomerResponse(customerName, transactionStatus, transactionStatusDescription);
  }

  public static CreateCustomerResponse asFailed(int transactionStatusCode, String transactionStatusDescription) {
    return new CreateCustomerResponse(0, transactionStatusCode, transactionStatusDescription);
  }
  
  private CreateCustomerResponse(long customerNumber, int transactionStatusCode, String transactionStatusDescription) {
    this.customerNumber = customerNumber;
    this.transactionStatusCode = transactionStatusCode;
    this.transactionStatusDescription = transactionStatusDescription;
  }

  public long getCustomerNumber() {
    return customerNumber;
  }
  public void setCustomerNumber(long customerNumber) {
    this.customerNumber = customerNumber;
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