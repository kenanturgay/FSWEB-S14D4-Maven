package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(double damage, int hitPoints, String name) {
        super(damage, hitPoints, name);
    }

    @Override
    public double bleed() {

        return getDamage()*0.25;

    }

    @Override
    public double poison() {
        return getDamage()*0.3;
    }


}
