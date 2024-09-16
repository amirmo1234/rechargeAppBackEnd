package com.example.app.model;

public class UserAddMoney {
    private double Amount;

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public UserAddMoney(double amount) {
        Amount = amount;
    }
}
