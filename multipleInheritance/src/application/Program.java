package application;

import devices.Printer;
import devices.Scanner;

public class Program {
    public static void main(String[] args) {
        Printer p = new Printer("1080");
        p.processDoc("My letter");
        p.print("My letter");

        Scanner s = new Scanner("2030");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
    }
}
