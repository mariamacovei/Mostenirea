package com.company;
public class Product {
    public String nameProduct;
    public float price;
    public String manufacturer;
    public int yearOfProduction;
    public String color;

    Product(String nameProduct, float price, String manufacturer, int yearOfProduction, String color){
        this.nameProduct=nameProduct;
        this.price=price;
        this.manufacturer = manufacturer;
        this.yearOfProduction=yearOfProduction;
        this.color=color;

    }
    public String getNameProduct(){
        return this.nameProduct;
    }
    public float getPrice(){
        return this.price;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public int getYearOfProduction(){
        return this.yearOfProduction;
    }
    public  String getColor(){
        return this.color;
    }
    public void setNameProduct(String nameProduct){
        this.nameProduct=nameProduct;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setYearOfProduction( int yearOfProduction){
        this.yearOfProduction=yearOfProduction;
    }
    public void setColor( String color){
        this.color=color;
    }
}

