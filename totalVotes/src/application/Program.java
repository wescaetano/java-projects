package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the file path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
        Map<String, Integer> candidates = new HashMap<>();

        String line = br.readLine();
        while(line != null){
            String[] partes = line.split(",");
            String nome = partes[0].trim();
            int votes = Integer.parseInt(partes[1]);
            candidates.put(nome, candidates.getOrDefault(nome, 0) + votes);
            line = br.readLine();
        }

        for(String key : candidates.keySet()){
            System.out.println(key + ", votes: " + candidates.get(key));
        }



        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
