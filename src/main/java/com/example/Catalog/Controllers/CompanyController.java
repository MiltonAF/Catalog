package com.example.Catalog.Controllers;


import java.util.ArrayList;
import java.util.Optional;

import com.example.Catalog.Models.CompanyModel;
import com.example.Catalog.Services.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")

public class CompanyController {

    @Autowired
    CompanyService service;

    @PostMapping()
    public CompanyModel saveCompany(@RequestBody CompanyModel company){
return service.saveCompany(company);
    }

    @GetMapping()
    public ArrayList<CompanyModel> getCompany(){
        return service.getCompany();
    }

    @GetMapping(path = "/{id}")
    public Optional<CompanyModel> getForId(@PathVariable("id") Long id){
        return service.getForId(id);
    }

  
    
}

