package com.cashflow.repository;

import com.cashflow.entity.CashFlow;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashFlowRepository  extends MongoRepository<CashFlow, String> {
}
