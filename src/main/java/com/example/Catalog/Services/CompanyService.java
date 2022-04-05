package com.example.Catalog.Services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Catalog.Models.CompanyModel;
import com.example.Catalog.Repositories.RepCompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    RepCompany companyRep;

    public CompanyModel saveCompany(CompanyModel company) {
        return companyRep.save(company);
    }

    public ArrayList<CompanyModel> getCompany() {
        return (ArrayList<CompanyModel>) companyRep.findAll();
    }

    public boolean deleteData(Long id) {
        try{
            companyRep.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public CompanyModel updateData(Long id,  CompanyModel company){
        return companyRep.save(company);
        
    }

  
    public Optional<CompanyModel> getForId(Long id) {
        return companyRep.findById(id);
    }

    public ArrayList<CompanyModel> searchForName(String name) {
        return (ArrayList<CompanyModel>) companyRep.findByName(name);
    }

}
