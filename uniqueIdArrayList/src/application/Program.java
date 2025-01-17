package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão digitados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.println("Employee#" + (i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.println("Esse ID já existe! tente de novo: ");
                id = sc.nextInt();
            }


            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Digite o ID do usuário que terá o aumento de salário: ");
        int idSalary = sc.nextInt();
        sc.nextLine();

        Integer pos = position(list, idSalary);
        if(pos == null){
            System.out.println("Esse ID não existe!");
        } else{
            System.out.print("Digte a porcentagem a acrescentar ao salário: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");

        for(Employee emp : list){
            System.out.println(emp);
        }




        sc.close();
    }
    // Função para encontrar o ID se houver na lista
    public static Integer position(List<Employee> list, int id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
