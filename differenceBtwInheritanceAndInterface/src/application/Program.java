package application;

import models.entitites.*;
import models.enums.Color;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AbstractShape s1 = new Rectangle(Color.BLUE, 10.25, 12.65);
        AbstractShape s2 = new Circle(Color.GREEN, 6.25);
        Shape s3 = new Triangle( 12.5,20.25);

        System.out.println("Rectangle color: " + s1.getColor());
        System.out.println("Rectangle area: " + s1.area());
        System.out.println("Circle color: " + s2.getColor());
        System.out.println("Circle area: " + s2.area());
        System.out.println("Triangle area: " + s3.area());
    }
}
