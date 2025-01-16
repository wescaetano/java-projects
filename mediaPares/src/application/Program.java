package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        int num = sc.nextInt();
        sc.nextLine();

        int[] vet = new int[num];

        for(int i=0; i<vet.length; i++){
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            vet[i] = num;
        }

        int soma=0;
        int cont=0;

        for(int i=0; i<vet.length; i++){
            if(vet[i] % 2 ==0){
                soma += vet[i];
                cont++;
            }
        }

        double media = (double)soma / cont;
        if(cont > 0) {
            System.out.printf("\nA media dos pares é: %.2f", media);
        }
        if(cont==0){
            System.out.println("\nNenhum número par!");
        }

    }
}
