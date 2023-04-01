package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory2 {

    VendingItem2 itemValues = new VendingItem2("", BigDecimal.valueOf(0.0), "", 0);
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

    public void updateInventory(String slotID){

        if (itemInfo.containsKey(slotID) && itemInfo.get(slotID).getStock() > 0){
            itemInfo.put(slotID, itemInfo.get(slotID).setStock(itemInfo.get(slotID).getStock()-1));
        }
    }

    public void displayInventory() {

        for (String s : itemInfo.keySet()){

            if (itemInfo.get(s).getStock() == 0){
                System.out.println(s + " " + itemInfo.get(s).getItem() + " "
                        + itemInfo.get(s).getPrice() + " Out of Stock :(");
            } else{
                System.out.println(s + " " + itemInfo.get(s).getItem() + " "
                        + itemInfo.get(s).getPrice() + " " + itemInfo.get(s).getStock());
            }

        }

    }
}


