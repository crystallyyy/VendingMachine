package com.techelevator.application;

import com.techelevator.application.VendingItem;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.FileNotFoundException;

public class VendingMachine extends VendingItem
{

    public void run() throws FileNotFoundException {
        while(true)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {

               displayItems();
                //displays: slot id, product, inventory of product
            }
            else if(choice.equals("purchase"))
            {
                System.out.println("(M) Feed Money");
                System.out.println("(S) Select Item");
                System.out.println("(F) Finish Transaction");
                // make a purchase
                //create submenu
                //purchase method
                //accept money
                //finish - returns change, current balance to 0, back to main menu
            }
            else if(choice.equals("exit"))
            {
                System.out.println("Goodbye (:");
                break;
            }
        }
    }
    
}
