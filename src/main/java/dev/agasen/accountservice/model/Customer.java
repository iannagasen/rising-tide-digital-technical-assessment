package dev.agasen.accountservice.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customers")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long customerNo;

  @NotBlank(message = "Customer name is required")
  @Size(max = 50, message = "Customer name must not exceed {max} characters")
  private String name;

  @NotBlank(message = "Customer mobile number is required")
  @Size(max = 20, message = "Customer mobile number must not exceed {max} characters")
  private String mobileNo;

  @NotBlank(message = "Customer email is required")
  @Email(message = "Invalid email format")
  @Size(max = 50, message = "Customer email must not exceed {max} characters")
  private String email;

  @NotBlank(message = "Primary address is required")
  @Size(max = 100, message = "Primary address must not exceed {max} characters")
  private String primaryAddress;

  @Size(max = 100, message = "Secondary address must not exceed {max} characters")
  private String secondaryAddress;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Account> accounts = new ArrayList<>();

  public void addAccount(Account account) {
    accounts.add(account);
    account.setCustomer(this);
  }

  public Customer(Long customerNo, String name, String mobileNo, String email, String primaryAddress,
      String secondaryAddress, List<Account> accounts) {
    this.customerNo = customerNo;
    this.name = name;
    this.mobileNo = mobileNo;
    this.email = email;
    this.primaryAddress = primaryAddress;
    this.secondaryAddress = secondaryAddress;
    this.accounts = accounts;
  }

  public Customer() {}

  public Long getCustomerNo() {
    return customerNo;
  }
  public void setCustomerNo(Long customerNo) {
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
  public List<Account> getAccounts() {
    return accounts;
  }
  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
}
