package dev.agasen.accountservice.model;

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

  @Override
  public String toString() {
    switch (code) {
      case "S": return "Savings";
      case "C": return "Checkings";
      default: return "";
    }
  }
}
