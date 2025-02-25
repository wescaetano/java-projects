package application;

import entities.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
         /*Generics: Ao tornar PrintService genérico com <T>, podemos definir o tipo exato
        na classe Program (como Integer, String, Double etc.). Isso traz segurança, pois
        impede a inserção de tipos errados na lista o que é chamado de type safety, e reutilização, já que a mesma classe
         pode ser usada em diferentes contextos sem precisar ser reescrita.
          */

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Type how many names: ");
        int nums = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<nums; i++){
            System.out.printf("Type the %d° name: ", i+1);
            ps.addValue(sc.nextLine());
        }

        ps.print();
        System.out.println();
            System.out.print("first number: " + ps.first());
    }
}
