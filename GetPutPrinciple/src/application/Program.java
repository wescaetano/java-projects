package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 10, 15, 2);
        List<Double> myDoubles = Arrays.asList(2.2, 8.5, 1.5, 7.2);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts, myObjects);
        print(myObjects);


    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for(Number number : source){
            destiny.add(number);
        }
    }

    public static void print(List<? super Number> list){
        for(Object number : list){
            System.out.println(number);
        }
    }
}
