package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
   public static void main(String[] args){
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the file full path: ");
       String path = sc.next();

       try(BufferedReader br = new BufferedReader(new FileReader(path))) {
           Set<LogEntry> set = new HashSet<>();

           String line = br.readLine();
           while(line != null){
               String[] fields = line.split(",");
               String name = fields[0].trim();
               Date moment = Date.from(Instant.parse(fields[1]));

               set.add(new LogEntry(name, moment));
               line = br.readLine();
           }

           System.out.println("Total users: " + set.size());

       }  catch (IOException e) {
           System.out.println("Error: " + e.getMessage());;
       }
   }
}
