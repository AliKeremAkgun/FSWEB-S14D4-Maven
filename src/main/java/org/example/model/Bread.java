package org.example.model;

public class Bread extends ProductForSale {

    private boolean isWholeGrain;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.isWholeGrain = true; // default değer
    }

    public Bread(String type, double price, String description, boolean isWholeGrain) {
        super(type, price, description);
        this.isWholeGrain = isWholeGrain;
    }

    public boolean isWholeGrain() {
        return isWholeGrain;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Whole Grain: " + isWholeGrain);
    }
}