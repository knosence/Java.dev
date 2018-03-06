package com.company;

import java.util.HashMap;
import java.util.Map;

public class Store {

    Map<Products, Integer> inventory;
    Map<Products, Integer> cart;


    public Store(){
        inventory = new HashMap<Products, Integer>();
    }

    public void getInventory(){
        System.out.println(inventory.toString());
    }

    public void getNumberOfItem(Products key){
        cart.get(key);
    }



}
