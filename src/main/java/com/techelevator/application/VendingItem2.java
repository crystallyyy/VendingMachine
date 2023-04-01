package com.techelevator.application;

import java.math.BigDecimal;

public class VendingItem2 {
    private String slotID;
    private String item;
    private BigDecimal price;
    private String type;
    private int stock;

    public VendingItem2(String item, BigDecimal price, String type, int stock) {
        this.item = item;
        this.price = price;
        this.type = type;
        this.stock = stock;
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
