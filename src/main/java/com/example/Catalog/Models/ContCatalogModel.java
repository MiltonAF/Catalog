package com.example.Catalog.Models;

import java.sql.Blob;

public class ContCatalogModel {
 private Long id;
 private String nameProduct;
 private String priceProduct;
 private Blob imgProduct;
 private Long idCatalog;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getNameProduct() {
    return nameProduct;
}
public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
}
public String getPriceProduct() {
    return priceProduct;
}
public void setPriceProduct(String priceProduct) {
    this.priceProduct = priceProduct;
}
public Blob getImgProduct() {
    return imgProduct;
}
public void setImgProduct(Blob imgProduct) {
    this.imgProduct = imgProduct;
}
public Long getIdCatalog() {
    return idCatalog;
}
public void setIdCatalog(Long idCatalog) {
    this.idCatalog = idCatalog;
}

 
}
