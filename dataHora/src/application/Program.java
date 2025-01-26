package application;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        // localDate = Data local
        //localDateTime = Data e hora local
        //instant = Data e hora global (GMT: horário Reino unido)

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2025-01-24");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-24T16:35:26");
        Instant d06 = Instant.parse("2025-01-24T16:35:26Z");
        Instant d07 = Instant.parse("2025-01-24T16:35:26-03:00");
        LocalDate d08 = LocalDate.parse("12/01/2000",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("12/01/2000 03:45",fmt2);
        LocalDate d10 = LocalDate.of(2025, 01, 24);
        LocalDateTime d11 = LocalDateTime.of(2025, 01, 24, 17, 03, 25);

        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);

        // Mundando o formato de impressão da data/hora

        System.out.println("d08 novo formato: " + d08.format(fmt1));
        System.out.println("d08 novo formato: " + fmt1.format(d08));
        System.out.println("d08 novo formato: " + d08.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 - data: " + d05.format(fmt1));
        System.out.println("d05 - data/hora: " + d05.format(fmt2));
        System.out.println("d06 - data/hora: " + fmt3.format(d06));

        // Outra forma de converter de fusorário GMT para o horário local
        LocalDateTime d12 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        // Também é possível definir o local para mudança do horário
        LocalDateTime d13 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("Horário de São Paulo: " + d12);
        System.out.println("Horário da Inglaterra: " + d06);
        System.out.println("Horário de Portugal: " + d13);

        // Consultar dia, mês e ano separadamente
        System.out.println("d06 - Dia: " + d04.getDayOfMonth());
        System.out.println("d06 - Mês: " + d04.getMonthValue());
        System.out.println("d06 - Ano: " + d04.getYear());
        System.out.println("d05 - Hora: " + d05.getHour());
        System.out.println("d05 - Minutos: " + d05.getMinute());

        // Operações com data e hora
        // Para adicionar dias, meses e ano usamos o plusDays, plusMonths etc.

        //Subtrair dias
        System.out.println("Menos 5 dias: " + d04.minusDays(5));

        //Subtrair meses
        System.out.println("Menos 1 mês: " + d04.minusMonths(1));

        //Subtrair anos
        System.out.println("Menos 2 anos: " + d04.minusYears(2));

        //Operações com data e hora = localDateTime
        // Para modificarmos as horas e minutos é obrigatório o formato estar em 'localDateTime'

        System.out.println("Horário: " + d05);
        System.out.println("Horário menos 2 minutos: " + d05.minusMinutes(2));
        System.out.println("Horário menos 2 horas: " + d05.minusHours(2));

        // Operações com data e hora usando 'instant'
        Instant lastWeek = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeek = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("original Date: " + d06);
        System.out.println("Last week: " + lastWeek);
        System.out.println("Next week: " + nextWeek);

        // Operações para calcular a diferença entre duas datas/horas

        Duration t1 = Duration.between(d06, lastWeek);
        System.out.println("Diferença entre: " + t1.toDays());
    }
}
