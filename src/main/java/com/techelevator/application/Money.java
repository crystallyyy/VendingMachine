package com.techelevator.application;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money {
    public BigDecimal moneyProvided;
    Scanner scanner = new Scanner(System.in);

    public void feedMoney(BigDecimal amount) {
        System.out.println("Insert Money: ");
        amount = scanner.nextBigDecimal();
        if (amount.equals(1.0)|| amount.equals(5.0) || amount.equals(10.0) || amount.equals(20.0)) {
            moneyProvided = moneyProvided.add(amount);

            System.out.println("Current Money Provided: $" + moneyProvided);

        } else {

            System.out.println("Invalid amount. Please enter a valid amount ($1, $5, $10, or $20).");
        }
    }

    public void updateMoney(){
//   showPurchaseMenu();
        if (){

         } else {
        System.out.println("Not enough money provided. Please add more money or select a cheaper item.");


    }

}





}
