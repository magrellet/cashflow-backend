package com.cashflow.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="cashflow")
public class CashFlow implements Serializable {

  private static final long serialVersionUID = 7526472295622776147L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column
  Double amount;
  @Column
  String description;
  @Column
  Date period;
  @Column
  Long categoryId;


}
