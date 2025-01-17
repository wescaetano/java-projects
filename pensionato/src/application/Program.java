package application;
import entities.Registro;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro Pensionato");
        System.out.println();

        System.out.print("Quantas pessoas farão o registro: ");
        int num = sc.nextInt();
        sc.nextLine();

        Registro[] registro = new Registro[num];

        for(int i=0; i< registro.length; i++){
            System.out.printf("Registro%d#", i+1);
            System.out.println();
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            System.out.println();
            registro[i] = new Registro(name, email, room);
        }

        System.out.print("Quartos ocupados");
        for(int i=0; i< registro.length; i++){
        if(registro[i].getRoom() != 0){
            System.out.printf("\nO quarto %d está ocupado", i+1);
        }
        }




    }
}
