package entities;

public class Account {
    private int number;
    private String holder;
    private double value;

    public Account() {
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        addValue(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getValue() {
        return value;
    }

    public void addValue(double value){
        this.value += value;
    }

    public void removeValue(double value){
        this.value -= value + 5.0;
    }

    public String toString(){
        return "Account: " + String.format("%d", number) + ", Holder: " + holder + ", Balance: " + String.format("%.2f", value);
    }

}


