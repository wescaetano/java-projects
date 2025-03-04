package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",  1500.00));
        list.add(new Product("Notebook",  1200.00));
        list.add(new Product("Tablet",  450.00));

        list.sort( new Mycomparator());

        for(Product prod : list){
            System.out.println(prod);
        }
    }
}
