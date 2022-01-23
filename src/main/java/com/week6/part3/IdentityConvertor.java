package com.week6.part3;

public class IdentityConvertor implements CurrencyConverter {
    private Money money;

    public IdentityConvertor(Money money) {
        this.money =  money;
    }

    @Override
    public Money convert(Money money) {
        return money;
    }
}
