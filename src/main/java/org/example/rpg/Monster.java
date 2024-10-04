package org.example.rpg;

public abstract class Monster {

    private String name;
    private int hitPoints;
    private double damage;

    public Monster(double damage, int hitPoints, String name) {
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public double attack() {
        double totalDamage = getDamage();

        // Eğer bu yaratık Bleedable ise bleed() metodunu ekle
        if (this instanceof Bleedable) {
            totalDamage += ((Bleedable) this).bleed();
        }

        // Eğer bu yaratık Poisonable ise poison() metodunu ekle
        if (this instanceof Poisonable) {
            totalDamage += ((Poisonable) this).poison();
        }

        return totalDamage;
    }
}
