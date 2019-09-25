package com.cashflow.service;

import com.cashflow.entity.CashFlow;
import com.cashflow.entity.Category;
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

  @Override
  public Category saveCategory(Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public List<Category> saveCategories(List<Category> categories) {
    return categoryRepository.saveAll(categories);
  }
}
