package com.restaurant.model;

public class restaurantapp {
	private int id;
    private String name;
    private String cuisine;

    public restaurantapp(int id, String name, String cuisine) {
        this.id = id;
        this.name = name;
        this.cuisine = cuisine;
    }
    public String getName() {
           return name;
	}
    public String getCuisine() {
        return cuisine;
	}
}





