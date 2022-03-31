package com.example.Catalog.Controllers;

import java.util.ArrayList;

import com.example.Catalog.Models.ContCatalogModel;
import com.example.Catalog.Services.ContCatalogService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ContCatalogController {
    ContCatalogService service;
    @PostMapping()
    public ContCatalogModel saveContCatalog(@RequestBody ContCatalogModel contCatalog){
        return service.saveContCatalog(contCatalog);
    }

    @GetMapping()
    public ArrayList<ContCatalogModel> getContCatalog(){
        return service.getContCatalog();
    }
}
