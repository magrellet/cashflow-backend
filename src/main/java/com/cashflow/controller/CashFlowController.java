package com.cashflow.controller;

import com.cashflow.entity.CashFlow;
import com.cashflow.entity.Category;
import com.cashflow.service.CashFlowService;
import java.util.List;
import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CashFlowController {


  private final CashFlowService service;

  @Inject
  public CashFlowController(CashFlowService service) {
    this.service = service;
  }

  @PostMapping("/wallet")
  @ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<CashFlow> save(@RequestBody CashFlow cashFlow) {
    ResponseEntity<CashFlow> response;
    response = new ResponseEntity<>(service.save(cashFlow), HttpStatus.CREATED);
    return response;
  }

  @GetMapping("/categories")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<List<Category>> getCategories() {
    ResponseEntity<List<Category>> response;
    response = new ResponseEntity<>(service.getCategories(), HttpStatus.OK);
    return response;
  }

  @PostMapping("/category")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
    ResponseEntity<Category> response;
    response = new ResponseEntity<>(service.saveCategory(category), HttpStatus.OK);
    return response;
  }

  @PostMapping("/categories")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<List<Category>> saveCategories(@RequestBody List<Category> categories) {
    ResponseEntity<List<Category>> response;
    response = new ResponseEntity<>(service.saveCategories(categories), HttpStatus.OK);
    return response;
  }
}

