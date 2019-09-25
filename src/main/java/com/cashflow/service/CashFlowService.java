package com.cashflow.service;

import com.cashflow.entity.CashFlow;
import com.cashflow.entity.Category;
import java.util.List;

public interface CashFlowService {
  CashFlow save(CashFlow cashFlow);

  List<Category> getCategories();

  Category saveCategory(Category category);

  List<Category> saveCategories(List<Category> categories);
}
