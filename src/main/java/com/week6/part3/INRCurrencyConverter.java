package com.week6.part3;

public class INRCurrencyConverter implements CurrencyConverter{
    private static final Double USDConversionRate = 74.42;
    private static final Double GBPConversionRate = 100.88;

    private Money money;

    public INRCurrencyConverter(Money money) {
        this.money = money;
    }

    @Override
    public Money convert(Money money) {
        if (money.getCurrencyType().equals(CurrencyType.USD)) {
            return convertFromUSD(money.getAmount());
        } else if (money.getCurrencyType().equals(CurrencyType.GBP)) {
            return convertFromGBP(money.getAmount());
        }
        return null;
    }

    public Money convertFromUSD(double amount) {
        return new Money(amount * USDConversionRate, CurrencyType.USD);
    }

    private Money convertFromGBP(Double amount) {
        return new Money(amount * GBPConversionRate, CurrencyType.USD);
    }
}
