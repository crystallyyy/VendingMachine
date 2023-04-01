package com.techelevator.application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PurchaseMenu2 {
    Scanner userInput = new Scanner(System.in);
    Inventory2 inventory = new Inventory2();
    String slotID = "";

    public void selectItem() throws FileNotFoundException {
        inventory.displayInventory();
        System.out.println("Enter the slot ID of the item you wish to purchase: ");
        slotID = userInput.nextLine();
        inventory.outOfStock();
        try{
            if (itemInfo.containsKey(slotID) && /*getStock*/) {

            }
        }


        }
    }
    //rewrite method using MAP, ask daniel to see if using map properly first


