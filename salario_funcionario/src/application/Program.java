package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("\nnome: ");
        emp.name = sc.next();
        System.out.println("\nGross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("\nTax: ");
        emp.tax = sc.nextDouble();

        System.out.println();

        System.out.println("\nEmployee: " + emp);

        System.out.println("\nWhich percentage do you want to increase salary: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("\nEmployee: " + emp);


    }
}
