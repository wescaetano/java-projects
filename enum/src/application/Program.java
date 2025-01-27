package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.sql.SQLOutput;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Trabalhando com enums, enums são basicamente um conjunto de
        // constantes para facilitar a legibilidade e a organização do código
        // ex: enum diasSemana(SEGUNDA, TERÇA, QUARTA...)

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

    }
}
