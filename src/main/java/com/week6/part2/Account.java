package com.week6.part2;

public class Account {
    //Mandatory Fields
    private Integer number;
    private String type;
    private String branch;
    private Double balance;

    //Optional Fields
    private String atmTransactions;
    private String emiSchedule;

    public Account(Integer number, String type, String branch, Double balance) {
        this.number = number;
        this.type = type;
        this.branch = branch;
        this.balance = balance;
    }

    public Account(AccountBuilder accountBuilder) {
        this.number = accountBuilder.getNumber();
        this.type = accountBuilder.getType();
        this.branch = accountBuilder.getBranch();
        this.balance = accountBuilder.getBalance();
        this.atmTransactions = accountBuilder.getAtmTransactions();
        this.emiSchedule = accountBuilder.getEmiSchedule();
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", atmTransactions='" + atmTransactions + '\'' +
                ", emiSchedule='" + emiSchedule + '\'' +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getBranch() {
        return branch;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAtmTransactions() {
        return atmTransactions;
    }

    public String getEmiSchedule() {
        return emiSchedule;
    }
}

class AccountBuilder {
    private Integer number;
    private String type;
    private String branch;
    private Double balance;

    private String atmTransactions;
    private String emiSchedule;

    public AccountBuilder(Integer number, String type, String branch, Double balance) {
        this.number = number;
        this.type = type;
        this.branch = branch;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getBranch() {
        return branch;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAtmTransactions() {
        return atmTransactions;
    }

    public String getEmiSchedule() {
        return emiSchedule;
    }

    public AccountBuilder setAtmTransactions(String atmTransactions) {
        this.atmTransactions = atmTransactions;
        return this;
    }

    public AccountBuilder setEmiSchedule(String emiSchedule) {
        this.emiSchedule = emiSchedule;
        return this;
    }

    public Account build() {
        return new Account(this);
    }
}
