package com.week6.part2;

public class AccountDemo {
    public static void main(String[] args) {
        AccountBuilder accountBuilder = new AccountBuilder(123, "saving", "retail", 999.0);
        accountBuilder.setAtmTransactions("5");
        accountBuilder.setEmiSchedule("weekly");
        Account account = accountBuilder.build();
        System.out.println(account  );
    }
}
