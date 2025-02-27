package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(3.0, 2.0));
        myShape.add(new Circle(3.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(3.0));
        myCircle.add(new Circle(4.5));

        System.out.println("Total area: " + totalArea(myShape));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
/* Quando usamos o tipo coringa delimitado não podemos adicionar elementos a lista, porque
o tipo é genérico, então, podemos adicionar um tipo qualquer que não seja compatível com o tipo da lista
 */
