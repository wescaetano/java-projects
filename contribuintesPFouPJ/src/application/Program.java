package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Pessoa> pessoa = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            System.out.printf("Tax payer #%d data", i+1);
            System.out.print("Individual or company (i/c): ");
            char tipo = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if(tipo == 'i'){
                System.out.print("Health expeditures: ");
                double healthExp = sc.nextDouble();
                pessoa.add(new PessoaFisica(rendaAnual,nome, healthExp));
            } else if(tipo == 'c'){
                System.out.print("Number of employees: ");
                int numEmp = sc.nextInt();
                sc.nextLine();
                pessoa.add(new PessoaJuridica(rendaAnual, nome, numEmp));
            }
        }

        System.out.println("Taxes paid:");
        for(Pessoa pe : pessoa){
            System.out.println(pe.getNome() + " $" + String.format("%.2f", pe.imposto()));
        }

        double sum = 0.0;
        for(Pessoa pe : pessoa){
            sum += pe.imposto();
        }

        System.out.println();
        System.out.print("Total taxes: " + String.format("%.2f", sum));


    }
}
