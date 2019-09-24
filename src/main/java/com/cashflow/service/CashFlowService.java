package com.cashflow.service;

import com.cashflow.Entity.CashFlow;
import com.cashflow.Entity.Category;
import java.util.List;

public interface CashFlowService {
  CashFlow save(CashFlow cashFlow);

  List<Category> getCategories();
}
