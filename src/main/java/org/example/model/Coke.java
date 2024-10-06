package org.example.model;

public class Coke extends ProductForSale{

    private int salesPrice;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.salesPrice = 300;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Sales Price: " + salesPrice);
    }
}
