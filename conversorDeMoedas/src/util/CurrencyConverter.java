package util;

public class CurrencyConverter {
    public static Double reaisValue(Double dollarPrice, Double dollarQuantity){
        Double dollarValue = dollarPrice * dollarQuantity;
        Double total = dollarValue + (dollarValue * 0.06);
        return total;
    }

}
