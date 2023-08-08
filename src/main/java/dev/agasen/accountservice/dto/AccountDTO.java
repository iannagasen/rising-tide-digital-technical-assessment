package dev.agasen.accountservice.dto;

import java.math.BigDecimal;

import dev.agasen.accountservice.model.Account;

public class AccountDTO {
  private String accountNumber;
  private String accountType;
  private BigDecimal availableBalance;
  
  public static AccountDTO fromEntity (Account account) {
    return new AccountDTO(
      account.getAccountNo().toString(),
      account.getAccountType().toString(),
      account.getAvailableBalance()
    );
  }

  public AccountDTO(String accountNumber, String accountType, BigDecimal availableBalance) {
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.availableBalance = availableBalance;
  }

  public AccountDTO() {}

  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }
  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }
}
