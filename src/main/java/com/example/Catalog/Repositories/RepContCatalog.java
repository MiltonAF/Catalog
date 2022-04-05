package com.example.Catalog.Repositories;

import java.util.ArrayList;

import com.example.Catalog.Models.ContCatalogModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepContCatalog extends MongoRepository<ContCatalogModel, Long> {
    ArrayList<ContCatalogModel> findByNameProduct(String nameProduct);
    
}
