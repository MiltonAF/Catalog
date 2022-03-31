package com.example.Catalog.Models;


public class CatalogModel {
    private Long id;
    private String title;
    private String date;
    private Long idCompany;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Long getIdCompany() {
        return idCompany;
    }
    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

}
