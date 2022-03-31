package com.example.Catalog.Services;

import java.util.ArrayList;

import com.example.Catalog.Models.CatalogModel;
import com.example.Catalog.Repositories.RepCatalog;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
    @Autowired
    RepCatalog catalogRep;

    public CatalogModel saveCatalog(CatalogModel catalog){
        return catalogRep.save(catalog);
    }

    public ArrayList<CatalogModel> getCatalog(){
        return (ArrayList<CatalogModel>)catalogRep.findAll();
    }
}
