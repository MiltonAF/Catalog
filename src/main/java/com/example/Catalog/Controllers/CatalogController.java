package com.example.Catalog.Controllers;

import java.util.ArrayList;

import com.example.Catalog.Models.CatalogModel;
import com.example.Catalog.Services.CatalogService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    CatalogService service;
    @PostMapping()
    public CatalogModel saveCatalog(@RequestBody CatalogModel catalog){
return service.saveCatalog(catalog);
    }

    @GetMapping()
    public ArrayList<CatalogModel> getCatalog(){
        return service.getCatalog();
    }
}
