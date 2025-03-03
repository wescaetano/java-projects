package application;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A: ");
        int n = sc.nextInt();
        sc.nextLine();

        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();
        for(int i=0; i<n; i++){
            System.out.printf("ID %d: ", i+1);
            courseA.add(sc.nextInt());
        }

        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.printf("ID %d: ", i+1);
            courseB.add(sc.nextInt());
        }

        System.out.print("How many students for course C: ");
        n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.printf("ID %d: ", i+1);
            courseC.add(sc.nextInt());
        }

        Set<Integer> totalStudents = new HashSet<>();
        totalStudents.addAll(courseA);
        totalStudents.addAll(courseB);
        totalStudents.addAll(courseC);

        int total = totalStudents.size();
        System.out.print("Total students: " + total);

        sc.close();
    }
}
