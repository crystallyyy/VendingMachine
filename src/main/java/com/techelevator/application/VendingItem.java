package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

import static java.lang.reflect.Array.*;

public class VendingItem {
    private String slotID;
    private String product;
    private BigDecimal price;
    private String productType;
    String userSelection = "";
    String[] vendingItems = new String[64];
    //method to check money
    //method to check inventory (Scanner reader method) (use Array)
    //method to update inventory

    public void displayItems() throws FileNotFoundException {

        File itemsFile = new File("catering.csv");

        try (Scanner scanner = new Scanner(itemsFile)) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                vendingItems = line.split(",");

                for (int i = 0; i < vendingItems.length - 3; i++) {
                    System.out.println(vendingItems[i] + " " + vendingItems[i + 1] + " " + vendingItems[i + 2]);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");

//        //Map of slot ID and price
//
        }
        //has subclasses Drink, Munchy, Gum, Candy
    }
}
