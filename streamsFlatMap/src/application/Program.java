package application;

import java.util.ArrayList;
import java.util.List;

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

    }
}
