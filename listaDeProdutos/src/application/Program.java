package application;

import entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite o nome de um produto:");
        Product.nome = sc.next();

        System.out.println("\nDigite o valor do produto: ");
        Product.valor = sc.nextDouble();

        System.out.println("\nDigite a quantidade de produtos: ");
        Product.quantidade = sc.nextInt();

        Product.totalQuantity();

        System.out.println("\nNome do produto: " + Product.nome + " valor: " + Product.valor + " total: " + Product.total);

        System.out.println("Digite a quantidade de produtos a serem adicionados: ");
        int quantidade = sc.nextInt();
        Product.addProducts(quantidade);
        Product.totalQuantity();

        System.out.println("\nNome do produto: " + Product.nome + " valor: " + Product.valor + " total: " + Product.total);

        System.out.println("Digite a quantidade de produtos a serem removidos: ");
        quantidade = sc.nextInt();
        Product.removeProducts(quantidade);
        Product.totalQuantity();

        System.out.println("\nNome do produto: " + Product.nome + " valor: " + Product.valor + " total: " + Product.total);



    }
}
