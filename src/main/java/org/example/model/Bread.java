package org.example.model;

public class Bread extends ProductForSale{

    private String braedName;

    public Bread(String description, int type, int price, String braedName) {
        super(description, type, price);
        this.braedName = braedName;
    }

    public String getBraedName() {
        return braedName;
    }



    @Override
    public void showDetails() {

        System.out.println("Bread is " + getBraedName() + " The price is " + getPrice());

    }
}
