package com.week6.part3;

public class USDCurrencyConverter implements CurrencyConverter{
    private static final Double INRConversionRate = 0.013;
    private static final Double GBPConversionRate = 1.36;

    private Money money;

    public USDCurrencyConverter(Money money) {
        this.money = money;
    }

    @Override
    public Money convert(Money money) {
        if (money.getCurrencyType().equals(CurrencyType.INR)) {
            return convertFromINR(money.getAmount());
        } else if (money.getCurrencyType().equals(CurrencyType.GBP)) {
            return convertFromGBP(money.getAmount());
        }
        return null;
    }

    public Money convertFromINR(double amount) {
        return new Money(amount * INRConversionRate, CurrencyType.USD);
    }

    private Money convertFromGBP(Double amount) {
        return new Money(amount * GBPConversionRate, CurrencyType.USD);
    }
}
