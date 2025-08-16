package com.example.countying.core.models;

public class FinanceRecord {
    private String id;
    private String type;
    private double amount;
    private String description;

    public FinanceRecord(String id, String type, double amount, String description) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
}
