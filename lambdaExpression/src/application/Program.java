package application;

import entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",  1500.00));
        list.add(new Product("Notebook",  1200.00));
        list.add(new Product("Tablet",  450.00));

        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        for(Product prod : list){
            System.out.println(prod);
        }
    }
}
