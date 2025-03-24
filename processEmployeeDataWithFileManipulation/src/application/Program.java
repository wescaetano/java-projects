package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            // Mostrar em ordem alfabetica o email dos func. que tem sal. sup. a um certo valor
            System.out.println("Enter a value to find employees with salary above it: ");
            double val = sc.nextDouble();

            // Imprimi na tela os emails dos func. que tem salario superior ao valor armazenado em 'val'
            list.stream().sorted(Comparator.comparing(Employee::getEmail))
                    .filter(p -> p.getSalario() > val).forEach(System.out::println);

            double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalario())
                    .reduce(0.0, (s, price) -> s + price);

            System.out.print("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
}
