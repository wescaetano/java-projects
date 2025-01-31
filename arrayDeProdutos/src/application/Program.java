package application;

import entities.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the number of products to be add in the array: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for(int i = 0; i< products.length; i++){
            sc.nextLine();
            System.out.print("Product name: ");
            String name = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i=0; i<products.length; i++){
            sum += products[i].getPrice();
        }

        double avg = sum / products.length;
        System.out.printf("The average price of the products is: %.2f", avg);

    }
}
