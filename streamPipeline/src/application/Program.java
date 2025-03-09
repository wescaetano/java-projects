package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);


        // A  'stream()' é uma operação intermediária assim como o 'map()'. Elas não podem ser printadas na tela por si só
        // as mesmas precisam de uma operação terminal/final para serem printadas, por exemplo o 'toArray()'


        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + sum);


        // Buscando os números pares da lista 'list' e multiplicando por dez
        // operação intermediaria 'map()' gera outra 'stream()' com um predicado para
        // gerar cada um de seus valores.

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
