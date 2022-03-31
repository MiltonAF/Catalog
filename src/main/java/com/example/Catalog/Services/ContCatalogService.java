package com.example.Catalog.Services;


import java.util.ArrayList;

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


}