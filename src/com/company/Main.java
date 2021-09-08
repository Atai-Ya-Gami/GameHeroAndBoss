package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------");
	Boss boss = new Boss(700, 50,"Physical");
        System.out.println("--------------------------");
	Hero hero = new Hero("Archer", 210, 25, "Piercing arrow");
        System.out.println("--------------------------");
        hero.setDamage(60);
        int heroDamage = hero.getDamage();
        System.out.println("Hero Damage: " + heroDamage);
    }
}
