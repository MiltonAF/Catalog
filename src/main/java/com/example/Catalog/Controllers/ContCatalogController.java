package com.example.Catalog.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.Catalog.Models.ContCatalogModel;
import com.example.Catalog.Services.ContCatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ContCatalogController {
    @Autowired
    ContCatalogService service;

    //Metodo para Agrergar un documento
    @PostMapping()
    public ContCatalogModel saveContCatalog(@RequestBody ContCatalogModel contCatalog) {
        return service.saveContCatalog(contCatalog);
    }

    //Metodolo Para Listar todos los documentos
    @GetMapping()
    public ArrayList<ContCatalogModel> getContCatalog() {
        return service.getContCatalog();
    }

    //Metodo para obtener un documento de acuerdo al id
    @GetMapping(path = "/{id}")
    public Optional<ContCatalogModel> getForId(@PathVariable("id") Long id) {
        return service.getForId(id);
    }

    //Metodo para eliminar un documento por el id
    @DeleteMapping(path = "/delete/{id}")
    public String deleteData(@PathVariable("id") Long id) {
        boolean ok = this.service.deleteData(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }

    //Metodo para actualizar un documento por el id
    @PutMapping(path = "/update/{id}")
    public ContCatalogModel updateData(@PathVariable("id") Long id, @RequestBody ContCatalogModel contCatalog) {
        return service.updateData(id, contCatalog);
    }

    //Metodo para otener los documentos por el nombre de la compañia
    @GetMapping(path = "/search/{nameProduct}")
    public ArrayList<ContCatalogModel> searchForName(@PathVariable("nameProduct") String nameProduct) {
        return service.searchForNameProduct(nameProduct);
    }
}
