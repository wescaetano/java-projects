package model.sevices;

import model.entities.Contract;
import model.entities.Installment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContractService{

    private OnlinePaymentService onlinePaymentService;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double totalValue = contract.getTotalValue();
        double basicInstallment = totalValue / months;
        LocalDate date = contract.getDate();


        for(int i=0; i<months; i++){
            LocalDate dueDate = date.plusMonths(1+i);
            double finalInstallment = basicInstallment + onlinePaymentService.interest(basicInstallment, i+1);
            finalInstallment += onlinePaymentService.paymentFee(finalInstallment);

            contract.getInstallments().add(new Installment(finalInstallment, dueDate));
        }
    }
}
