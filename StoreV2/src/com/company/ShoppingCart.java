package com.company;

import java.util.HashMap;

public class ShoppingCart extends Store {

    public ShoppingCart(){
        cart = new HashMap<Products, Integer>();
    }

    public void addItemsToCart(Products key, Integer value){
        cart.put(key, value);
        Integer newValue;
        for(int i = 0; i < value; i++){
        }

        inventory.replace(key, newValue);
    }

    public void removeItemsFromCart(Products key, Integer value){
        cart.remove(key, value);
        inventory.put(key, value);
    }

    public void getItems(){
        if(cart.isEmpty()){
            System.out.println("Nothing in cart");
        } else{
            System.out.println(cart.toString());
        }
    }

}
