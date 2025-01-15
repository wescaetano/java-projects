package entities;

import java.util.Scanner;

public class Product {
    public static String nome;
    public static double valor;
    public static int quantidade;
    public static double total;

    public static void addProducts(int valor){
        quantidade += valor;
    }

    public static void removeProducts(int valor){
        quantidade -= valor;
    }

    public static void totalQuantity(){
        total = quantidade * valor;
    }


}
