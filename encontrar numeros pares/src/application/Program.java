package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números irá digitar: ");
        int num = sc.nextInt();

        sc.nextLine();

        int[] vet = new int[num];

        for(int i=0; i < vet.length; i++){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            vet[i] = num;
        }

        ArrayList pares = new ArrayList();
        int cont=0;
        for(int i=0; i < vet.length; i++){
            if(vet[i] % 2 == 0 && vet[i] > 0){
                pares.add(vet[i]);
                cont++;
            }
        }
        System.out.println("Quantidade de pares: " + cont);
        System.out.println("pares: " + pares);
    }
}
