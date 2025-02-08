package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(123, "Weslley", 1250.00);
        BusinessAccount bacc = new BusinessAccount(1234, "Pedro", 1300.00, 250.00);
        SavingsAccount sacc = new SavingsAccount(1234, "Pedro", 1300.00, 10.00);

        // Upcasting
        Account acc1 = sacc;
        Account acc2 = new BusinessAccount(1234, "joão", 7500.00, 250.00);

        System.out.println(acc1);

        // Downcasting

        BusinessAccount bacc2 =  (BusinessAccount) acc2;
        System.out.println(bacc2);
        bacc2.loan(100.00);

        // Override
        System.out.println("--------------------------------------");
        System.out.println("Override: SavingsAccount ");
        Account account = new SavingsAccount(2345, "Weslley", 1500.00, 10.00);
        account.withdraw(500.00);
        System.out.println(account);

        System.out.println("-----------------------------------------");
        System.out.println("Override: Account ");
        Account account2 = new Account(3456, "Pedro", 1500.00);
        account2.withdraw(500.00);
        System.out.println(account2);

        System.out.println("-----------------------------------------");
        System.out.println("Override: BusinessAccount ");
        Account account3 = new BusinessAccount(4567, "João", 1500.00, 10.00);
        account3.withdraw(500.00);
        System.out.println(account3);
    }
}
