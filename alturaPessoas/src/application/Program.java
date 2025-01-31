package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão adicionadas no array: ");
        int n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for(int i=0; i< vet.length; i++){
            System.out.print("Digite o nome da pessoa: ");
            String name = sc.next();
            System.out.println("Digite a idade da pessoa: ");
            int age = sc.nextInt();
            System.out.println("Digite a altura da pessoa: ");
            double height = sc.nextDouble();
            vet[i] = new Pessoa(name, age, height);
        }

        double soma = 0.0;
        int menor16 = 0;

        for(int i=0; i< vet.length; i++){
        // Soma das alturas
        soma += vet[i].getHeight();

        if(vet[i].getAge() < 16){
            menor16++;
            System.out.printf("nome menores de 16: %s ", vet[i].getName());
        }
        }
        double porcem16 = (double)menor16 / vet.length * 100;
        System.out.printf("\nPorcentagem dos menores de 16: %.2f", porcem16);
        double avgHeight = soma / vet.length;
        System.out.printf("\nAltura média: %.2f", avgHeight);
    }
}
