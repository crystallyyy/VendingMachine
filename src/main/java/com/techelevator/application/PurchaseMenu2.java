package com.techelevator.application;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PurchaseMenu2 {
    Scanner userInput = new Scanner(System.in);
    Inventory2 inventory;
    public static int count = 0;

    public PurchaseMenu2( Inventory2 inventory){
        this.inventory = inventory;
    }

    public void selectItem(String slotID) throws FileNotFoundException {


        if (inventory.getItemInfo().containsKey(slotID)
                && inventory.getItemInfo().get(slotID).getStock() > 0) {
            count++;
            inventory.updateInventory(slotID);

            if(inventory.getItemInfo().get(slotID).getType().equals("Munchy")){
                System.out.println("The item you selected is " + inventory.getItemInfo().get(slotID).getItem());
                System.out.println("Munchy, Munchy, so Good!");
            } else if (inventory.getItemInfo().get(slotID).getType().equals("Candy")){
                System.out.println("The item you selected is " + inventory.getItemInfo().get(slotID).getItem());
                System.out.println("Sugar, Sugar, so Sweet!");
            } else if (inventory.getItemInfo().get(slotID).getType().equals("Drink")){
                System.out.println("The item you selected is " + inventory.getItemInfo().get(slotID).getItem());
                System.out.println("Drinky, Drinky, Slurp Slurp!");
            } else if (inventory.getItemInfo().get(slotID).getType().equals("Gum")){
                System.out.println("The item you selected is " + inventory.getItemInfo().get(slotID).getItem());
                System.out.println("Chewy, Chewy, Lots O Bubbles!");
            }

        } else if (inventory.getItemInfo().get(slotID).getStock() == 0){

            System.out.println("This item is out of stock :(");
        }


    }

    public void writeAudit(){
        //TODO: PrintWriter method
    }
    }








