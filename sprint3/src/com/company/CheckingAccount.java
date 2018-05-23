package com.company;

public class CheckingAccount extends Account{
    public CheckingAccount(int balance){
        super.setAmount(balance);
    }
    public void withdraw(int balance) {
        balance = super.getAmount() - balance;
        super.setAmount(balance);
    }
}
