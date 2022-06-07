package com.example.Catalog.Repositories;

import com.example.Catalog.Models.CatalogModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepCatalog extends MongoRepository<CatalogModel, Long> {
    
}
