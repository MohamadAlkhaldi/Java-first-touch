package com.company;

public class Account {
    int balance;
    String name;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return balance;
    }

    public void deposit(int balance) {
        this.balance = this.balance + balance;
    }

    public void setAmount(int balance) {
        this.balance = balance;
    }
}
