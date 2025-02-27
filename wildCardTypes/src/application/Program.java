package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10, 12);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    /*
        OBS: O tipo curinga não aceita que sejam adicionados valores a lista
        pois ele não consegue identificar se o valor a ser adicionado é o mesmo do
        valor da lista passada como parametro
    */
}

