package org.example.model;

public class Coke extends ProductForSale{

    private String cokeName;

    public Coke(String description, int type, int price, String cokeName) {
        super(description, type, price);
        this.cokeName = cokeName;
    }

    public String getCokeName() {
        return cokeName;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke is " + getCokeName() + ". The price is " + getPrice() );
    }
}
