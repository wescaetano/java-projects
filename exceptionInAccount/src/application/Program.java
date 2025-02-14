package application;

import model.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        try{
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double firstDeposit = sc.nextDouble();
            System.out.print("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, firstDeposit, withdrawLimit);



            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println(account);

        } catch(DomainException e){
            throw new RuntimeException("Error: " + e.getMessage());
        } catch(RuntimeException e){
            throw new RuntimeException("Unexpected error");
        }
    }
}
