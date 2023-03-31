package com.techelevator.application;

import java.util.Scanner;

public class Money {
    public double moneyProvided = 0;
    Scanner scanner = new Scanner(System.in);

    public void feedMoney(double amount) {
        System.out.println("Insert Money: ");
        amount = scanner.nextInt();
        if (amount == 1.0 || amount == 5.0 || amount == 10.0 || amount == 20.0) {
            moneyProvided += amount;

            System.out.println("Current Money Provided: $" + moneyProvided);

        } else {

            System.out.println("Invalid amount. Please enter a valid amount ($1, $5, $10, or $20).");
        }
    }





}
