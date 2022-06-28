package com.example.serializationparsing;

import java.io.Serializable;

public class Account implements Serializable {

    public static String accountType = "LOAN";

    private long accountNumber;
    private String customerName;
    private double accountBalance;

    public Account(long accountNumber, String customerName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = accountBalance;
    }

    public static String getAccountType() {
        return accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", customerName='" + customerName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
