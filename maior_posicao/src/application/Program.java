package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números irá digitar: ");
        int num = sc.nextInt();

        int[] vet = new int[num];

        sc.nextLine();

        for(int i=0; i < vet.length; i++){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            vet[i] = num;
        }

        int maiorValor=0;
        int posicao=0;
        for(int i=0; i < vet.length; i++){
            if(i == 0){
                maiorValor = vet[i];
            }
            if(vet[i] > maiorValor){
                maiorValor = vet[i];
                posicao = i;
            }
        }

        System.out.print("\nO maior valor é: " + maiorValor);
        System.out.print("\nSua posição é: " + posicao);

    }
}
