package com.techelevator.application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PurchaseMenu extends Inventory {
    Scanner userInput = new Scanner(System.in);
    String slotID = "";

    public PurchaseMenu(String[] vendingItems) {
        super(vendingItems);
    }

    public void selectItem() throws FileNotFoundException {

        displayItems();
        System.out.println("Enter the slot ID of the item you wish to purchase: ");
        slotID = userInput.nextLine();

        slotIdAndStock(slotID);
        try {

        if(slotsAndStock.containsKey(slotID) && slotsAndStock.get(slotID) > 0) {

            if (slotsAndType.get(slotID).equals("Drink")) {
                System.out.println(slotsAndItem.get(slotID) + " " + slotsAndPrice.get(slotID) + " "  /*TODO: money remaining*/);
                System.out.println("Drinky, Drinky, Slurp, Slurp!");
            } else if (slotsAndType.get(slotID).equals("Candy")) {
                System.out.println(slotsAndItem.get(slotID) + " " + slotsAndPrice.get(slotID) + " "  /*TODO: money remaining*/);
                System.out.println("Sugar, Sugar, so Sweet!");
            } else if (slotsAndType.get(slotID).equals("Gum")) {
                System.out.println(slotsAndItem.get(slotID) + " " + slotsAndPrice.get(slotID) + " "  /*TODO: money remaining*/);
                System.out.println("Chewy, Chewy, Lots O Bubbles!");
            } else if (slotsAndType.get(slotID).equals("Munchy")) {
                System.out.println(slotsAndItem.get(slotID) + " " + slotsAndPrice.get(slotID) + " "  /*TODO: money remaining*/);
                System.out.println("Munchy, Munchy, so Good!");
            }

        }
        } catch (Exception e){
                System.out.println("This slot identifier does not exist.");
            }



    }



}
