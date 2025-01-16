package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        int num = sc.nextInt();
        sc.nextLine();

        double[] notas = new double[num];
        double soma = 0.0;

        for(int i=0; i<notas.length; i++){
            System.out.print("Digite uma nota: ");
            double nota = sc.nextDouble();
            notas[i] = nota;

            soma += notas[i];
        }

        double media = 0.0;
        media = soma / notas.length;
        System.out.printf("\nMedia das notas: %.3f", media);
        System.out.println();

        System.out.println("\nNotas abaixo da media: ");
        for(int i=0; i<notas.length; i++){
            if(notas[i] < media){
                System.out.printf("%.3f",notas[i]);
            }
        }

    }
}
