package org.example.model;

public class Bread extends ProductForSale{

    private int quantity;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.quantity = 100;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type : " + getType() + " Price : " + getPrice() + " Description : " + getDescription() + " Amount : " + quantity);
    }
}
