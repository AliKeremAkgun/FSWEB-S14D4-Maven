package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 10, "Sweet Chocolate");
        products[1] = new Coke("Coke", 10, "Refreshing Coke");
        products[2] = new Bread("Bread", 10, "Fresh Bread");

        Store store = new Store();
        store.listProducts(products);
    }
}