package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachine extends VendingItem
{
    PurchaseMenu purchase;
    Money money;
    Scanner scanner = new Scanner(System.in);

    public VendingMachine(){
        loadItems();
        purchase = new PurchaseMenu(this.vendingItems);
    }

    public void run() throws FileNotFoundException {

        while(true)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {

               displayItems();

            }
            else if(choice.equals("purchase"))
            {
                System.out.println("(M) Feed Money");
                System.out.println("(S) Select Item");
                System.out.println("(F) Finish Transaction");

                String selection = scanner.nextLine().trim().toLowerCase();

                if (selection.equals("m")){

                    money.feedMoney();

                    //feed money method
                } else if (selection.equals("s")) {
                    purchase.selectItem();
                } else if (selection.equals("f")){
                    //give change method
                    //update balance method
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
