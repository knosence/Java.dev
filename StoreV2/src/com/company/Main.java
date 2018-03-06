package com.company;

public class Main {

    public static void main(String[] args) {

        Products Cup = new Products("Cups", 2);
        Products bag = new Products("Bags", 1);
        Products plates = new Products("Plates", 3);
        Products charcoal = new Products("Charcoal", 12);
        Products mug = new Products("mugs", 1.2);

        Store walmart = new Store();
        walmart.inventory.put(Cup, 16);
        walmart.inventory.put(bag, 20);
        walmart.inventory.put(plates, 14);
        walmart.inventory.put(charcoal, 30);
        walmart.inventory.put(mug, 9);

        Products apple = new Products("Apples", .99);
        Products orange = new Products("oranges", .99);
        Products pear = new Products("Pears", 1);
        Products banana = new Products("Bananas", .89);
        Products grape = new Products("Grapes", .62);

        Store publix = new Store();
        publix.inventory.put(apple, 10);
        publix.inventory.put(orange, 0);
        publix.inventory.put(pear, 2);
        publix.inventory.put(banana, 8);
        publix.inventory.put(grape, 11);

        Products hammer = new Products("Hammers", 1);
        Products drill = new Products("Drills", 1);
        Products nail = new Products("Nails", 1);
        Products screwdriver = new Products("Screwdrivers", 1);
        Products ratchet = new Products("Ratchet", 1);

        Store homedepot = new Store();
        homedepot.inventory.put(hammer, 3);
        homedepot.inventory.put(drill, 1);
        homedepot.inventory.put(nail, 9);
        homedepot.inventory.put(screwdriver, 3);
        homedepot.inventory.put(ratchet, 5);

        homedepot.getInventory();

        ShoppingCart cart = new ShoppingCart();
        cart.getItems();

        cart.getItems();
        homedepot.getInventory();
    }
}
