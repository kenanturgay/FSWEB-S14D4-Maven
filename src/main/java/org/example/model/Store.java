package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0]= new Chocolate("Milk chocolate", 2,15, "Milka");
        products[1]= new Coke("Pepsi drink",3,25, "Pepsi");
        products[2]= new Bread("Whole Wheat bread", 5,10,"Mardin Bread");



        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for(ProductForSale product:products){
            product.showDetails();
        }

    }
}