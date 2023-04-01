package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory2 {

    VendingItem2 itemValues = new VendingItem2("", new BigDecimal("0.0"), "", 0);
    Map<String, VendingItem2 > itemInfo = new HashMap<>();

    public Map<String, VendingItem2> getItemInfo() {

        return itemInfo;
    }

    public void stockInventory() {

        File itemsFile = new File("catering.csv");

        try (Scanner scanner = new Scanner(itemsFile)) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] eachItem = line.split(",");

                for (int i =0; i < eachItem.length; i+=4){
                    itemValues = new VendingItem2(eachItem[i+1], new BigDecimal(eachItem[i+2]), eachItem[i+3], 6 );
                    itemInfo.put(eachItem[i], itemValues);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");

        }

    }

    public void updateInventory(Map<String, VendingItem2> itemInfo){

        if (itemInfo.containsKey(slotID) && itemInfo.get(slotID).getStock() > 0){
            itemInfo.put(slotID, itemInfo.get(slotID).getStock()-1);
        }


    }

    public void outOfStock() {

    }


    public void displayInventory() {
        for (Map.Entry<String, VendingItem2> mappy : itemInfo.entrySet()) {
            System.out.println(mappy.getKey() + " " + mappy.getValue().toString());
            if (itemInfo.getStock() == 0){
                System.out.println(mappy.getKey() + " " + mappy.getValue().toString() + " Item Not Available :(" );
            }
        }
    }
}


