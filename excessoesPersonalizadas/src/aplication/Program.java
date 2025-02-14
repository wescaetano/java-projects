package aplication;

import model.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = fmt1.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = fmt1.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter date to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = fmt1.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = fmt1.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Updated reservation: " + reservation);
        } catch(ParseException e){
            System.out.println("Invalid date format");
        } catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
    }
}
