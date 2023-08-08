package dev.agasen.accountservice.exceptions;

public class CustomerNotFoundException extends RuntimeException {
  public CustomerNotFoundException() {
      super("Customer not found");
  }

  public CustomerNotFoundException(String message) {
      super(message);
  }

  public CustomerNotFoundException(String message, Throwable cause) {
      super(message, cause);
  }
}
