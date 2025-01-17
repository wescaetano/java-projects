package application;

import entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas: ");
        int num = sc.nextInt();
        sc.nextLine();

        Account[] account = new Account[num];

        for (int i = 0; i < account.length; i++) {
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double value = sc.nextDouble();
            account[i] = new Account(name, value);
            sc.nextLine();
            System.out.println();
        }

        System.out.println();
        System.out.println("ID's dos usuários:");
        for (Account value : account) {
            System.out.println("Usuário " + value.getName() + " ID: " + value.getId());
        }

        System.out.print("Digite o ID do funcionário que terá aumento no salário: ");
        String id = sc.next();

        for(Account value : account){
            if(value.getId().equals(id)){
                System.out.print("\nSalário antes do acrescimo: " + value.getValue());
                System.out.print("\nDigite a porcentagem de aumento: ");
                int increase = sc.nextInt();
                value.salaryIncrease(increase);
                sc.nextLine();
                System.out.println("Salário após aumento: " + value.getValue());
            }
        }



    }
}

