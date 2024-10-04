package org.example.model;

public abstract class ProductForSale {

    private int price;
    private String description;
    private int type;

    public ProductForSale(String description, int type, int price) {
        this.description = description;
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }


    public int getType() {
        return type;
    }

    public int getSalesPrice(int quantity) {
        return quantity * this.price;
    }

    public abstract void showDetails();
}
