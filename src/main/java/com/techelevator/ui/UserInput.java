package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput
{
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption()
    {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("d"))
        {
            return "display";
        }
        else if (option.equals("p"))
        {
            return "purchase";
        }
        else if (option.equals("e"))
        {
            return "exit";
        }

        return "";
    }

    public static String getPurchaseMenuOption(){

        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("(M) Feed Money");
        System.out.println("(S) Select Item");
        System.out.println("(F) Finish Transaction");

        System.out.println();
        System.out.println("Please select an option: ");
        String selectedOption = scanner.nextLine();

        String option = selectedOption.trim().toLowerCase();

        if (option.equals("m")){

            return "feed";

        } else if (option.equals("s")){

            return "select";

        } else if (option.equals("f")){

            return "finish";

        }
        return "";
    }

    public static BigDecimal getMoney(){

        System.out.println("Insert Money: ");
        BigDecimal moneyInserted = scanner.nextBigDecimal();

        return moneyInserted;
    }

    public static String getSlotID(){
        System.out.println("Give the slot ID of the item you wish to purchase: ");
        String slotId = scanner.nextLine();

        return slotId;

    }
}
