package com.example.Catalog.Services;


import java.util.ArrayList;
import java.util.Optional;

import com.example.Catalog.Models.ContCatalogModel;
import com.example.Catalog.Repositories.RepContCatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContCatalogService {
    @Autowired
    RepContCatalog contCatalogRep;

    public ContCatalogModel saveContCatalog(ContCatalogModel contCatalog){
        return contCatalogRep.save(contCatalog);
    }

    public ArrayList<ContCatalogModel> getContCatalog(){
        return (ArrayList<ContCatalogModel>)contCatalogRep.findAll();
    }

    public boolean deleteData(Long id) {
        try{
            contCatalogRep.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public ContCatalogModel updateData(Long id,ContCatalogModel contCatalog){
        return contCatalogRep.save(contCatalog);
        
    }

  
    public Optional<ContCatalogModel> getForId(Long id) {
        return contCatalogRep.findById(id);
    }

    public ArrayList<ContCatalogModel> searchForNameProduct(String nameProduct) {
        return (ArrayList<ContCatalogModel>) contCatalogRep.findByNameProduct(nameProduct);
    }



}