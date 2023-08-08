package dev.agasen.accountservice.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_accounts")
public class Account {
  private Long id;
  private Long accountNo;
  private AccountType accountType;
  private BigDecimal availableBalance;

  public boolean isSavingsAccount() {
    return AccountType.SAVINGS.equals(accountType);
  }

  public Account(Long id, Long accountNo, AccountType accountType, BigDecimal availableBalance) {
    this.id = id;
    this.accountNo = accountNo;
    this.accountType = accountType;
    this.availableBalance = availableBalance;
  }

  public Account() {}

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Long getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }
  public AccountType getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }
  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }
  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }
}
