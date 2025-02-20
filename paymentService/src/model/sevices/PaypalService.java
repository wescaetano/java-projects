package model.sevices;

import java.util.Date;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double paymentFee(Double amount) { // Tarifa de 2% ao mês
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) { // juros de 1%
        return amount * 0.01 * months ;
    }
}
