package com.week6.part3;

public class ConversionFactoryDemo {
    public static void main(String[] args) {
        Money moneyInINR = new Money(100.0, CurrencyType.INR);
        CurrencyConverter currencyConverterToUSD = CurrencyConvertorFactory.getCurrencyConverterTo(CurrencyType.USD, moneyInINR);
        Money moneyInUSD = currencyConverterToUSD.convert(moneyInINR);

        System.out.println(moneyInUSD);
    }
}
