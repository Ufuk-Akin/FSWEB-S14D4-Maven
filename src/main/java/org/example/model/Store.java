package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale product1 = new Chocolate("Dark Chocolate", 100, "%50 Cocoa");
        ProductForSale product2 = new Coke ("Coca Cola" , 59 , "Bottle");
        ProductForSale product3 = new Bread ("Baget" , 29 , "Hot");

//        product1.showDetails();
//        product2.showDetails();
//        product3.showDetails();

        ProductForSale [] products = {product1, product2, product3};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
            for (ProductForSale product : products) {
                product.showDetails();
                System.out.println("****************");
            }
    }

}