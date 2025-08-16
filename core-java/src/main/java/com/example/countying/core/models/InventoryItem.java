package com.example.countying.core.models;

public class InventoryItem {
    private String id;
    private String itemName;
    private int quantity;

    public InventoryItem(String id, String itemName, int quantity) {
        this.id = id;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int q) { this.quantity = q; }
}
