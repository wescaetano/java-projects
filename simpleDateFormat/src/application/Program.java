package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        // Criando um formato para exibir dia, mês e ano.
        SimpleDateFormat  fmt1 = new SimpleDateFormat("dd/MM/yyyy");
        // Formato para exibir dia, mês, ano e horário atual.
        SimpleDateFormat  fmt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Convertendo para o formato especificado.
        String dataAtual = fmt1.format(new Date());
        String dataHoraAtual = fmt2.format(new Date());

        // Imprimindo na tela a data atual.
        System.out.println("Formato 1: ");
        System.out.println(dataAtual);
        System.out.println("Formato 2: ");
        System.out.println(dataHoraAtual);
    }
}
