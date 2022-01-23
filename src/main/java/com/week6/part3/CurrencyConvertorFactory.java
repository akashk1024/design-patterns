package com.week6.part3;

public class CurrencyConvertorFactory {
    public static CurrencyConverter getCurrencyConverterTo(CurrencyType newCurrency, Money money) {
        CurrencyType currentCurrency = money.getCurrencyType();
        if (newCurrency.equals(currentCurrency)) {
            return new IdentityConvertor(money);
        } else if (newCurrency.equals(CurrencyType.USD)) {
            return new USDCurrencyConverter(money);
        } else if (newCurrency.equals(CurrencyType.GBP)) {
            return new GBPCurrencyConverter(money);
        } else if (newCurrency.equals(CurrencyType.INR)) {
            return new INRCurrencyConverter(money);
        } else {
            return null;
        }
    }
}
