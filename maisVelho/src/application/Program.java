package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão adicionadas: ");
        int num = sc.nextInt();
        sc.nextLine();

        int[] idade = new int[num];
        String[] nome = new String[num];

        String name;
        int age;
        for(int i=0; i<num; i++){
            System.out.print("Digite o nome da pessoa: ");
            name = sc.next();
            System.out.print("Digite a idade da pessoa:");
            age = sc.nextInt();

            nome[i] = name;
            idade[i] = age;
        }

        int maisVelho = idade[0];
        String nomeMaisVelho = nome[0];
        for(int i=0; i<num; i++){
            if(idade[i] > maisVelho){
                maisVelho = idade[i];
                nomeMaisVelho = nome[i];
            }
        }

        System.out.print("O mais velho é: " + nomeMaisVelho);

    }
}
