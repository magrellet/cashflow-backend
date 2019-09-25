package com.cashflow;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.cashflow.repository")
@Configuration
public class MongoConfig  extends AbstractMongoConfiguration {

  @Value("${mongo.db.name}")
  String mongoDbName;

  @Value("${mongo.db.url}")
  String mongoDbUrl;

  @Value("${mongo.db.port}")
  Integer mongoDbPort;


  @Override
  public MongoClient mongoClient() {
    return new MongoClient(mongoDbUrl, mongoDbPort);
  }


  @Override
  protected String getDatabaseName() {
    return mongoDbName;
  }
}