package com.example.Catalog.Services;

import java.util.ArrayList;
import java.util.Optional;

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

    public boolean deleteData(Long id) {
        try{
            catalogRep.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public CatalogModel updateData(Long id,  CatalogModel catalog){
        return catalogRep.save(catalog);
        
    }

  
    public Optional<CatalogModel> getForId(Long id) {
        return catalogRep.findById(id);
    }
    
}

