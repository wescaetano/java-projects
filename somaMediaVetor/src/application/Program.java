package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números terá o array: ");
        int n = sc.nextInt();

        int soma = 0;

        int[] vet = new int[n];
        for(int i=0; i<vet.length; i++){
            sc.nextLine();
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();

            soma += vet[i];
        }

        double avg = (double)soma / vet.length;

        System.out.print("\nValores: ");
        for (int i = 0; i < vet.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(vet[i]);
        }

        System.out.printf("\nSoma: %d", soma);
        System.out.printf("\nMédia: %.2f", avg);
    }
}
