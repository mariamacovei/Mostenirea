package com.company;
import com.company.Product;
//import com.company.Shoes;

public class Shoes extends Product {
    public int size;
    public boolean superiorQuality;
    public String typeShoes;
    Shoes(String nameProduct, float price, String manufacturer, int yearOfProduction, String color,int size,boolean superiorQuality,String typeShoes){
        super(nameProduct,price,manufacturer, yearOfProduction,color);
        this.size=size;
        this.superiorQuality=superiorQuality;
        this.typeShoes=typeShoes;
    }
    public int getSize(){
        return this.size;
    }
    public boolean getSuperiorQuality(){
        return this.superiorQuality;
    }
    public String getTypeShoes(){
        return this.typeShoes;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setSuperiorQuality(boolean superiorQuality){
        this.superiorQuality=superiorQuality;
    }
    public void setTypeShoes(String typeShoes){
        this.typeShoes=typeShoes;
    }
}
