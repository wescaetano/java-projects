package application;

import entities.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
                new LightNovel("Monogatari", 4.00)
        ));



                List<String> titles = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4.00)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(lightNovels);
        System.out.println(titles);






    }
}
