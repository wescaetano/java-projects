package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harrisson");
        List<String> students = List.of("Matheus", "João Souza", "Alex Douglas");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        // Até antes da versão 8 do Java, para imprimirmos valores aninhados teriamos
        // que fazer o seguinte:

        for(List<String> people : devDojo){
            for(String person : people){
                System.out.println(person);
            }
        }

        // Com o 'FlatMap' isso se torna bem mais simples, já que ele adentra uma camada
        // da coleção aninhada para podermos trabalhar com esses valores:

        System.out.println();
        System.out.println("-------FlatMap---------");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
