package com.cashflow.service;

import com.cashflow.Entity.CashFlow;
import com.cashflow.Entity.Category;
import com.cashflow.repository.CategoryRepository;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class CashFlowServiceImpl implements CashFlowService {

  private final CategoryRepository categoryRepository;

  @Inject
  CashFlowServiceImpl(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  @Override
  public CashFlow save(CashFlow cashFlow) {
    return null;
  }

  @Override
  public List<Category> getCategories() {
    return categoryRepository.findAll();
  }
}
