package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        int num = sc.nextInt();

        sc.nextLine();

        int[] vet1 = new int[num];
        int[] vet2 = new int[num];
        int[] vetSoma = new int[num];


        System.out.println("Vetor 1:");
        System.out.println();

        for(int i=0; i<vet1.length; i++){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            vet1[i] = num;
        }

        System.out.println();
        System.out.println("Vetor 2:");
        System.out.println();

        for(int i=0; i<vet2.length; i++){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            vet2[i] = num;
        }

        System.out.println("Vetor 3: ");
        System.out.println();

        for(int i=0; i<vet2.length; i++){
           vetSoma[i] = vet1[i] + vet2[i];

            System.out.printf("\nPosição %d: %d", i+1, vetSoma[i]);
        }
    }
}
