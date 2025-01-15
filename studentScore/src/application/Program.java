package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("\nInsert the student name: ");
        Student.name = sc.next();

        System.out.println("\nInsert the first score between 0-30: ");
        student.score1 = sc.nextDouble();
        System.out.println("\nInsert the second score between 0-35: ");
        student.score2 = sc.nextDouble();
        System.out.println("\nInsert the third score between 0-35: ");
        student.score3 = sc.nextDouble();

        String finalScore;
        finalScore = student.finalScore();

        System.out.println(finalScore);

    }
}
