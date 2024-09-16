package com.example.app.model;

import lombok.Data;

@Data
public class UserModel {
    private String userName;
    private double amount;
    private UserAddMoney UserAddMoney;

}
