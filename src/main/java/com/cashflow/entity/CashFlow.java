package com.cashflow.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class CashFlow {

  @Id
  Long id;
  Double amount;
  String description;
  Date period;
  Long categoryId;


}
