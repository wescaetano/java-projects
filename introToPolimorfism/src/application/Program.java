package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> product = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Product data #%d\n", i + 1);
            System.out.print("Common, uded or imported (c/u/i):");
            char kind = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (kind == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                Date manufactureDate = fmt1.parse(date);
                product.add(new UsedProduct(name, price, manufactureDate));
            } else if (kind == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                product.add(new ImportedProduct(name, price, customsFee));
            } else if (kind == 'c') {
                product.add(new Product(name, price));
            } else {
                System.out.println("Invalid input!");
            }
        }

        for (Product p : product) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
