package application;

import entities.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;

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


        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();

        for(LightNovel l : lightNovels){
            if(l.getPrice() <= 4.00){
                titles.add(l.getTitle());
            }
            if(titles.size() >=3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);




    }
}
