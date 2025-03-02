package application;

import entities.Product;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Product> set = new HashSet<>();
        set.add(new Product("Tv", 2200.00));
        set.add(new Product("Tablet", 920.50));

        Product prod = new Product("Tv", 2200.00);

        System.out.println(set.contains(prod));
    }
}
