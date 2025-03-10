package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the file path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            int cont=0;
            double sum=0.0;
            for(Product p : list){
                cont++;
                sum += p.getPrice();
            }
            final double average = sum / cont;
            System.out.println("Products average price: " + String.format("%.2f", average));
            list.stream().sorted(Comparator.comparing(Product::getName).reversed()).filter(p -> p.getPrice() < average).forEach(System.out::println);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
