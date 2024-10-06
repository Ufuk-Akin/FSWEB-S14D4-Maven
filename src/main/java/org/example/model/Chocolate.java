package org.example.model;

public class Chocolate extends ProductForSale{

    private int amount;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.amount = 200;

    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription()
        + " Sales Price: " + amount);
    }
}
