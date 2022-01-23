package com.week6.part3;

public class GBPCurrencyConverter implements CurrencyConverter{
    private static final Double USDConversionRate = 0.74;
    private static final Double INRConversionRate = 0.0099;

    private Money money;

    public GBPCurrencyConverter(Money money) {
        this.money = money;
    }

    @Override
    public Money convert(Money money) {
        if (money.getCurrencyType().equals(CurrencyType.USD)) {
            return convertFromUSD(money.getAmount());
        } else if (money.getCurrencyType().equals(CurrencyType.INR)) {
            return convertFromINR(money.getAmount());
        }
        return null;
    }

    public Money convertFromUSD(double amount) {
        return new Money(amount * USDConversionRate, CurrencyType.USD);
    }

    private Money convertFromINR(Double amount) {
        return new Money(amount * INRConversionRate, CurrencyType.USD);
    }
}
