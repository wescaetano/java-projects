package application;

import entities.Account;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Account creation: ");
        System.out.println();

        System.out.print("Type the account number: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Type the holder name: ");
        String holder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n): ");
        String firstDeposit = sc.nextLine().trim().toLowerCase();

        double value = 0.0;

        if(firstDeposit.equals("y")){
        System.out.print("Type the value: ");
            value = sc.nextDouble();
        }

        Account account = new Account(number, holder, value);

        System.out.println();
        System.out.println("Account data: "+ account);

        sc.nextLine();
        System.out.print("Type a new holder name for the account: ");
        holder = sc.nextLine();

        account.setHolder(holder);

        System.out.print("Type a deposit value: ");
        value = sc.nextDouble();

        account.addValue(value);

        System.out.println("Account data: "+ account);

        System.out.println("Type a withdrawn value: ");
        value = sc.nextDouble();

        account.removeValue(value);

        System.out.println("Account data: "+ account);

    
    
    }

        

}
