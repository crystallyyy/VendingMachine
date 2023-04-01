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
    String[] vendingItems = new String[64];

    public void loadItems() {

        File itemsFile = new File("catering.csv");

        try (Scanner scanner = new Scanner(itemsFile)) {
            int lineNum = 0;
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] eachItem = line.split(",");

                for (int i =0; i < eachItem.length; i++){
                    vendingItems[(lineNum*4) + i] = eachItem[i];
                }
                lineNum++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");

        }

    }

    public void displayItems(){

        for (int i = 0; i < vendingItems.length - 3; i+=4) {
            System.out.println(vendingItems[i] + " " + vendingItems[i + 1] + " " + vendingItems[i + 2]);
        }
    }
}
