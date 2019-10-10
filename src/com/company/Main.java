package com.company;
import com.company.Product;
import com.company.Shoes;
import com.company.Watch;

public class Main {

    public static void main(String[] args) {
        Product MissDior=new Product("MISS DIOR ABSOLUTELY BLOOMING",2880.50f,"Christian Dior",2016,"pink");
        System.out.println(MissDior.getNameProduct());
        System.out.println(MissDior.getPrice());
        System.out.println(MissDior.getManufacturer());
        System.out.println(MissDior.getYearOfProduction());
        System.out.println(MissDior.getColor());
        System.out.println("      New product of shoes:     ");
        Shoes Adidasi=new Shoes("addiasi",1025.98f," Coquette",2019,"white",38,true,"sport");
        System.out.println(Adidasi.getNameProduct());
        System.out.println(Adidasi.getPrice());
        System.out.println(Adidasi.getManufacturer());
        System.out.println(Adidasi.getYearOfProduction());
        System.out.println(Adidasi.getSize());
        System.out.println(Adidasi.getSuperiorQuality());
        System.out.println(Adidasi.getTypeShoes());
        Watch Ceas=new Watch( " Rolex",20000f,"Rolex",2003,"gold",10.2f ,0.155f);
        System.out.println(Ceas);

    }
}
