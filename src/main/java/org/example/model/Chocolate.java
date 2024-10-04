package org.example.model;

public class Chocolate extends ProductForSale{

    private String chocolateName;

    public Chocolate(String description, int type, int price, String chocolateName) {
        super(description, type, price);
        this.chocolateName = chocolateName;
    }

    public String getChocolateName() {
        return chocolateName;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate is " + getChocolateName() + ". The price is " + getPrice());
    }
}
