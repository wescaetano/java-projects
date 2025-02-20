package application;

import model.entities.Contract;
import model.entities.Installment;
import model.sevices.ContractService;
import model.sevices.OnlinePaymentService;
import model.sevices.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Número: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int nInstallments = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(number, date, contractValue);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, nInstallments);

    System.out.println("PARCELAS:");
        for(Installment inst : contract.getInstallments()){
            System.out.println(inst);
        }

    }
}
