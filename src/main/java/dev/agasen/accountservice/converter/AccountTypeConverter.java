package dev.agasen.accountservice.converter;

import dev.agasen.accountservice.model.AccountType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class AccountTypeConverter implements AttributeConverter<AccountType, String> {

  @Override
  public String convertToDatabaseColumn(AccountType attribute) {
    return attribute.getCode();
  }

  @Override
  public AccountType convertToEntityAttribute(String dbData) {
    return AccountType.fromCode(dbData);
  }
  
}
