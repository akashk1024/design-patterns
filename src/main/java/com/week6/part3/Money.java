package com.week6.part3;

public class Money {
    private Double amount;
    private CurrencyType currencyType;

    public Money(Double amount, CurrencyType currencyType) {
        this.amount = amount;
        this.currencyType = currencyType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currencyType=" + currencyType +
                '}';
    }
}
