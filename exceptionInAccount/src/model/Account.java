package model;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer account) {
        this.number = account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        if(balance < amount && withdrawLimit < amount){
            throw new DomainException("The amount exceeds withdraw limit and balance");
        }
        if(balance < amount){
            throw new DomainException("Not enough balance");
        }
        if(withdrawLimit < amount){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account number: " + number +
                ", holder: " + holder +
                ", balance: " + balance;
    }
}
