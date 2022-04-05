package com.example.Catalog.Controllers;


import java.util.ArrayList;
import java.util.Optional;

import com.example.Catalog.Models.CompanyModel;
import com.example.Catalog.Services.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @DeleteMapping(path = "/delete/{id}")
    public String deleteData(@PathVariable("id") Long id){
        boolean ok = this.service.deleteData(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

    @PutMapping(path = "/update/{id}")
    public CompanyModel updateData(@PathVariable("id") Long id, @RequestBody CompanyModel company){
       return service.updateData(id, company);
    }

    @GetMapping(path ="/search/{name}")
    public ArrayList<CompanyModel> searchForName(@PathVariable("name") String name){
        return service.searchForName(name);
    }
   
  
    
}

