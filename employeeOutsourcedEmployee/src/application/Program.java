package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employee = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            System.out.println("Employee #" + (i+1) + ": data");
            System.out.print("Outsourced (y/n): ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(outsourced == 'y'){
                System.out.print("AdditionalCharge: ");
                double additionalCharge = sc.nextDouble();
                employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else if(outsourced == 'n') {
                employee.add(new Employee(name, hours, valuePerHour));
            } else{
                System.out.println("This input is invalid!");
            }
        }

        for(Employee emp : employee){
            System.out.println(emp);
        }

        sc.close();
    }
}
