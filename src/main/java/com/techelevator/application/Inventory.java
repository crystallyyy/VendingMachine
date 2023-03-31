package com.techelevator.application;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Inventory extends VendingItem {

    Map<String, Integer> slotsAndStock = new HashMap<>();
    Map<String, BigDecimal> slotsAndPrice = new HashMap<>();
    Map<String, String> slotsAndItem = new HashMap<>();
    Map<String, String> slotsAndType = new HashMap<>();

    public void slotIdAndStock() {

        for (int i = 0; i < vendingItems.length; i += 4) {
            slotsAndStock.put(vendingItems[i], 6);
        }

        if (slotsAndStock.containsKey(userSelection) && slotsAndStock.get(userSelection) > 0) {

            slotsAndStock.put(userSelection, slotsAndStock.get(userSelection) - 1);
        } else if (slotsAndStock.containsKey(userSelection) && slotsAndStock.get(userSelection) == 0) {
            System.out.println("This item is out of stock :(");
            //purchase menu method here
        } else {
            System.out.println("The slotID you entered does not exist");
            //purchase menu method here
        }
    }

    public void slotIdAndPrice() {
        for (int i = 0; i < vendingItems.length; i += 4) {
            slotsAndPrice.put(vendingItems[i], BigDecimal.valueOf(Double.parseDouble(vendingItems[i + 2])));
        }
    }

    public void slotIdAndItem() {
        for (int i = 0; i < vendingItems.length; i += 4) {
            slotsAndItem.put(vendingItems[i], vendingItems[i + 1]);
        }
    }

    public void slotIdAndType() {
        for (int i = 0; i < vendingItems.length; i += 4) {
            slotsAndType.put(vendingItems[i], vendingItems[i + 3]);
        }
    }






}
