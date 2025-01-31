package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (dd/MM/yyyy): ");
        String birthDate = sc.next();

        // Instanciando o cliente
        Client client = new Client(name, email, sdf.parse(birthDate));
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next().toUpperCase());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.println("How many itens to this order: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Enter product #" + (i+1) + ":");
            System.out.print("Enter product name: ");
            String productName = sc.nextLine();
            System.out.print("Enter product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("Order Summary: ");
        System.out.println(order);


    }
}
