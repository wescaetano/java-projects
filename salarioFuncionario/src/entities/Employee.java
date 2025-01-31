package entities;

public class Employee {
    public static String name;
    public static double grossSalary;
    public static double tax;

    public static double netSalary(){
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public static void increaseSalary(double porcentage){
        grossSalary += grossSalary * porcentage / 100;
    }

    public String toString(){
        return "name: " + name + ", Net Salary: $" + String.format("%.2f",netSalary());
    }
}
