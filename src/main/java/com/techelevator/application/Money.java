package com.techelevator.application;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money {
    private BigDecimal moneyProvided;
    private BigDecimal cost;
    private BigDecimal moneyUpdated;

    BigDecimal oneDollar = new BigDecimal(1);
    BigDecimal fiveDollars = new BigDecimal(5);
    BigDecimal tenDollars = new BigDecimal(10);
    BigDecimal twentyDollars = new BigDecimal(20);

    Scanner scanner = new Scanner(System.in);
    Inventory2 inventory2;

    public Money(Inventory2 inventory2){
        this.inventory2 = inventory2;
    }


    public void feedMoney(BigDecimal amount) {

        if (amount.equals(oneDollar)|| amount.equals(fiveDollars) || amount.equals(tenDollars) || amount.equals(twentyDollars)) {

            moneyProvided = new BigDecimal(String.valueOf(amount));

            //how to update moneyProvided even tho its BigDecimal?

            System.out.println("Current Money Provided: $" + moneyProvided);

        } else {

            System.out.println("Invalid amount. Please enter a valid amount ($1, $5, $10, or $20).");

        }
    }

    public void applyDiscount(String slotID) {

        int discount = 0;

        if (moneyProvided.compareTo(inventory2.getItemInfo().get(slotID).getPrice()) >= 0) {

            if (PurchaseMenu2.count % 2 == 0) {

                discount = PurchaseMenu2.count / 2;

            } else if (PurchaseMenu2.count % 2 == 1) {

                discount = PurchaseMenu2.count / 2;
            }
            cost = new BigDecimal(String.valueOf(moneyProvided.subtract(inventory2.getItemInfo().get(slotID).getPrice().subtract(BigDecimal.valueOf(discount)))));
            System.out.println("The cost is: " + cost);
        } else {
            System.out.println("Not enough money provided. Please add more money or select a cheaper item.");

        }
    }

    public void updateMoney(String slotID){
        moneyUpdated = new BigDecimal(String.valueOf(moneyProvided.subtract(cost))) ;
        System.out.println("The money remaining is " + moneyUpdated);
         }

    public void returnChange(){
        double change = moneyUpdated.doubleValue();
        int dollars = (int) change;
        change -= dollars;
        int quarters = (int) (change / 0.25);
        change -= quarters * 0.25;
        int dimes = (int) (change / 0.1);
        change -= dimes * 0.1;
        int nickels = (int) (change / 0.05);

        System.out.println("Your change is " + dollars + " dollars, "
                + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

        // how to reset balance to zero? -- use double variable to update thru class, use bigDec.valueOf for math?

        //method to update subtracts original price from money provided, apply discount at end to add money to change given to make up for discount
        //set cost to property in VendingItem2 for price?
    }
}








