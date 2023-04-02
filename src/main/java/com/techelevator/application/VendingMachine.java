package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachine
{

    Inventory2 inventory2 = new Inventory2();

    PurchaseMenu2 purchase = new PurchaseMenu2(inventory2);
    Money money = new Money(inventory2);
    Scanner scanner = new Scanner(System.in);
    String selection = "";

    public VendingMachine(){

    }

    public void run() throws FileNotFoundException {

        inventory2.stockInventory();
        UserOutput.displayHomeScreen();

        while(true)
        {

            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                System.out.println();
                System.out.println("slotID -- Item -- Price -- Stock");
                System.out.println();
                inventory2.displayInventory();

            }
            else if(choice.equals("purchase"))
            {
                UserOutput.displayPurchaseMenu();
                selection = UserInput.getPurchaseMenuOption();


                if (selection.equals("feed")){

                    BigDecimal moneyInserted = UserInput.getMoney();
                    money.feedMoney(moneyInserted);

//                    UserOutput.displayPurchaseMenu();
//                    selection = UserInput.getPurchaseMenuOption();

                    //after feed, make it go back to purchase menu without home menu

                } else if (selection.equals("select")) {

                    inventory2.displayInventory();

                    String slotID = UserInput.getSlotID();

                    money.applyDiscount(slotID);

                    money.updateMoney(slotID); //if it runs -> then selectItem, checks if money is sufficient

                    try {

                        purchase.selectItem(slotID);

                    } catch (FileNotFoundException e){
                        System.out.println("This item does not exist");
                    }

                    inventory2.updateInventory(slotID);
                    money.applyDiscount(slotID);


                } else if (selection.equals("finish")){

                    money.returnChange();
                    //update balance method to $0
                    UserInput.getHomeScreenOption();
                }

            }
            else if(choice.equals("exit"))
            {
                System.out.println("Goodbye (:");
                break;
            }
        }
    }
    
}
