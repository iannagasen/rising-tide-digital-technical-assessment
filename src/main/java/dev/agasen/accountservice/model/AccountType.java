package dev.agasen.accountservice.model;

import java.util.Arrays;

public enum AccountType {
  SAVINGS("S"),
  CHECKINGS("C");

  private final String code;

  AccountType(String code) {
      this.code = code;
  }

  public String getCode() {
    return code;
  }

  public static AccountType fromCode(String code) {
    return Arrays.stream(AccountType.values())
      .filter(type -> type.getCode().equals(code))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException("Unknown AccountType code: " + code));
  }

  @Override
  public String toString() {
    switch (code) {
      case "S": return "Savings";
      case "C": return "Checkings";
      default: return "";
    }
  }
}
