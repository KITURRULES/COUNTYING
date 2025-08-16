package com.example.countying.core.models;

public class Business {
    private String id;
    private String name;
    private String description;
    private String location;

    public Business(String id, String name, String description, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
}
