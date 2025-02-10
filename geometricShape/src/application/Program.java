package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Shape> shape = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            System.out.print("Retangle or circle (r/c): ");
            char kind = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE.RED): ");
            String color = sc.next().toUpperCase();
            if(kind == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shape.add(new Rectangle(Color.valueOf(color), width, height));
            } else if(kind == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shape.add(new Circle(Color.valueOf(color), radius));
            }
        }

        for(Shape sh : shape){
            System.out.println(sh);
        }


    }
}
