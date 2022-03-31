package com.example.Catalog.Repositories;

import com.example.Catalog.Models.CompanyModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepCompany extends MongoRepository<CompanyModel, Long> {
    
}
