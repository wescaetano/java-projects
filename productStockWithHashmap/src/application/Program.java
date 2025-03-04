package application;

import entities.Product;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Product prod1 = new Product("Tv", 1250.00);
        Product prod2 = new Product("Tablet", 650.00);
        Product prod3 = new Product("Videogame", 2200.00);

        Map<Product, Double> stock = new HashMap<>();
        stock.put(prod1, 500.00);
        stock.put(prod2, 350.00);
        stock.put(prod3, 450.00);

        Product ps = new Product("Tv", 1250.00);

        System.out.println("Contains key 'ps': " + stock.containsKey(ps));
    }
}
