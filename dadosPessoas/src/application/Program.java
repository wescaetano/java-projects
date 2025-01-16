package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int num = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoa = new Pessoa[num];

        for(int i=0; i< pessoa.length; i++){
            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();
            System.out.print("Digite o genêro (M/F): ");
            String gender = sc.next().toUpperCase();

            pessoa[i] = new Pessoa(gender, altura);
        }

        double menorAltura=0.0;
        double maiorAltura=0.0;
        double somaAlturaMulheres=0.0;
        int cont=0;
        int contH=0;
        for(int i=0; i< pessoa.length; i++){
            if(i ==0){
                menorAltura = pessoa[i].getAltura();
                maiorAltura = pessoa[i].getAltura();
            }

            if(pessoa[i].getAltura() > maiorAltura){
                maiorAltura = pessoa[i].getAltura();
            }

            if(pessoa[i].getAltura() < menorAltura){
                menorAltura = pessoa[i].getAltura();
            }

            if(pessoa[i].getGender().equals("F")){
                somaAlturaMulheres += pessoa[i].getAltura();
                cont++;
            }

            if(pessoa[i].getGender().equals("M")){
                contH++;
            }
        }

        double mediaAlturaMulheres;

        System.out.print("\nMenor altura: " + menorAltura);
        System.out.print("\nMaior altura: " + maiorAltura);

        //Media altura mulheres
        if(cont > 0){
            mediaAlturaMulheres = somaAlturaMulheres / cont;
            System.out.print("\nMedia altura mulheres: " + mediaAlturaMulheres);

        } else{
            System.out.println("\nNenhuma mulher foi cadastrada!");
        }
        System.out.print("\nQuantidade de homens: " + contH);
    }
}
