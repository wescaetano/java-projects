package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números terá o array: ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for(int i=0; i<vet.length; i++){
            sc.nextLine();
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        boolean encontrouNegativo=false;
        System.out.println("Números negativos encontrados: ");
        for(int i=0; i<vet.length; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
                encontrouNegativo=true;
            }
        }
        if(encontrouNegativo == false){
            System.out.println("Nenhum negativo foi encontrado!");
        }

    }
}
