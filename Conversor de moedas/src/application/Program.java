package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dollar price: ");
        Double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars you will be bought: ");
        Double dollarQuantity = sc.nextDouble();

        Double total = CurrencyConverter.reaisValue(dollarPrice, dollarQuantity);

        System.out.printf("Amount to be paid in reais: %.2f%n", total);
    }
}
