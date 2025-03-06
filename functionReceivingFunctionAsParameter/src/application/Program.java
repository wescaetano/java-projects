package application;

import entities.Product;
import model.services.ProductService;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 1200.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService srv = new ProductService();
        double sum = srv.filteredSum(list, p -> p.getName().charAt(0) == 'H');

        System.out.println("Sum: " + String.format("%.2f", sum));

    }
}
