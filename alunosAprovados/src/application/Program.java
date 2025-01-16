package application;

import entities.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int num = sc.nextInt();
        sc.nextLine();

        Aluno[] aluno = new Aluno[num];

        for(int i=0; i< aluno.length; i++){
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.next();
            System.out.print("Digite a primeira nota do aluno: ");
            double p1 = sc.nextDouble();
            System.out.print("Digite a segunda nota do aluno: ");
            double p2 = sc.nextDouble();
            aluno[i] = new Aluno(nome, p1, p2);
        }

        ArrayList<String> nomes = new ArrayList<>();

        for(int i=0; i<aluno.length; i++){
        if(aluno[i].getP1() + aluno[i].getP2() / 2 > 6){
            nomes.add(aluno[i].getNome());
        }
        }

        System.out.print("Alunos aprovados: " + nomes);
    }
}
