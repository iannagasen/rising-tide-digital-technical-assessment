package dev.agasen.accountservice.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String customerNo;
  private String name;
  private String mobileNo; 
  private String email;
  private String primaryAddress;
  private String secondaryAddress;
  private AccountType accountType;
  private List<Account> accounts;

  public Customer(Long id, String customerNo, String name, String mobileNo, String email, String primaryAddress,
      String secondaryAddress, AccountType accountType, List<Account> accounts) {
    this.id = id;
    this.customerNo = customerNo;
    this.name = name;
    this.mobileNo = mobileNo;
    this.email = email;
    this.primaryAddress = primaryAddress;
    this.secondaryAddress = secondaryAddress;
    this.accountType = accountType;
    this.accounts = accounts;
  }

  public Customer() {}

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getCustomerNo() {
    return customerNo;
  }
  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getMobileNo() {
    return mobileNo;
  }
  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPrimaryAddress() {
    return primaryAddress;
  }
  public void setPrimaryAddress(String primaryAddress) {
    this.primaryAddress = primaryAddress;
  }
  public String getSecondaryAddress() {
    return secondaryAddress;
  }
  public void setSecondaryAddress(String secondaryAddress) {
    this.secondaryAddress = secondaryAddress;
  }
  public AccountType getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }
  public List<Account> getAccounts() {
    return accounts;
  }
  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  

}
