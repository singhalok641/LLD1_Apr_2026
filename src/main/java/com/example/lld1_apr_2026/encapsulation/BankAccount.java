package com.example.lld1_apr_2026.encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amount) { // controlled access
        // validate the value of amount

        if(amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
