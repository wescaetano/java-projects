package application;

import entities.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<LightNovel> lightNovels = new ArrayList<>( List.of(
                new LightNovel("Tensei Shittara", 8.99),
                new LightNovel("Overlord", 3.99),
                new LightNovel("Violet Evergarden", 5.99),
                new LightNovel("No Game no Life", 2.99),
                new LightNovel("Fullmetal Alchemist", 5.99),
                new LightNovel("Kumo  desuga", 1.99),
                new LightNovel("Kumo  desuga", 1.99),
                new LightNovel("Monogatari", 4.00)
        ));


        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        System.out.println();
        // Conta todos os itens da lista com preço menor que 4
        System.out.println("todos os itens da lista com preço menor que 4");
        long count = stream.filter(ln -> ln.getPrice() <= 4.00).count();

        System.out.println(count);

        // Conta todos os itens distintos da lista com preço menor que 4
        System.out.println("todos os itens distintos da lista com preço menor que 4");
        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4.00).count();

        System.out.println(count2);







    }
}
