package com.techelevator.application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PurchaseMenu extends Inventory {
    Scanner userInput = new Scanner(System.in);

    public void selectItem() throws FileNotFoundException {
        displayItems();
        System.out.println("Enter the slot ID of the item you wish to purchase: ");
        String slotID = userInput.nextLine();
        if(slotID)
    }


}
