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
            // reduce(0.0, (sum, price) -> sum + price): Inicia com 0.0 e soma cada preço.
            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (sum,price) -> sum + price) / list.size();

            System.out.println("Products average price: " + String.format("%.2f", avg));
            list.stream().sorted(Comparator.comparing(Product::getName).reversed()).filter(p -> p.getPrice() < avg).forEach(System.out::println);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
