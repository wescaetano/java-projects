package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Set<Product> set = new TreeSet<>();

        set.add(new Product("Tv", 2200.00));
        set.add(new Product("Tablet", 1200.00));
        set.add(new Product("Smartphone", 3200.00));

        for(Product prod : set){
            System.out.println(prod);
        }
    }
}
