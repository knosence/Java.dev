package com.company;

public class Products {

    public String name;
    public double price;

    public Products(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getProductPrice(String price){
        return this.price;
    }


    @Override
    public String toString() {
        return name;
    }
}
