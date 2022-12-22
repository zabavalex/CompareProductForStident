package org.example;

import org.example.entities.HotDrink;
import org.example.entities.Product;
import org.example.entities.Snack;

public class Main {
    public static void main(String[] args) {
        Product hotDrink = new HotDrink("1", 1, 10);
        Product snack = new Snack("1", 1, 10);
        System.out.println(hotDrink.compareTo(snack));
    }
}