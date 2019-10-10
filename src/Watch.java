package com.company;
import com.company.Product;
import com.company.Product;

public class Watch extends Product {
    public float lengthWatch;
    public float weight;

    Watch(String nameProduct, float price, String manufacturer, int yearOfProduction, String color, float lengthWatch, float weight){
        super(nameProduct, price, manufacturer, yearOfProduction, color);
        this.lengthWatch = lengthWatch;
        this.weight = weight;
    }

    public float getLengthWatch() {
        return this.lengthWatch;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setLengthWatch(float lengthWatch) {
        this.lengthWatch = lengthWatch;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return (" Ceasul de modelul " + getNameProduct() + " , are pretul " + getPrice() + " ,este produs de " + getManufacturer()+  " in anul "  + getYearOfProduction()+  " culoarea  "+getColor()+ " are lungimea de " +getLengthWatch()+ " si greutatea de " +getWeight()+ "kg");
    }
}
