package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    method1();
}
    public static void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********* Method 1 start *********");
        method2();
        System.out.println("End of program");
        System.out.println("********* Method 1 end *********");
    }



public static void method2(){
    Scanner sc = new Scanner(System.in);
    System.out.println("****** Method 2 start *******");

    // No tratamento de excessões existem dois blocos o 'try': que tenta executar determinado código
    // e o catch: que tem uma excessão como parametro. Se essa excessão for a mesma do bloco 'try'
    // então o programa entra nesse bloco 'catch' e executa o que estiver dentro. Obs: podem existir vários blocos
    // 'catch' com diferentes excessões.

    try{
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);

    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Input beyond bounds of array!");
        e.printStackTrace();
        sc.next();
    } catch(InputMismatchException e){
        System.out.println("Invalid character!");
        e.printStackTrace();
        sc.next();
    }
    System.out.println("****** Method 2 end *******");
    }
}



