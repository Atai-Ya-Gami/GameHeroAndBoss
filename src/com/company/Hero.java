package com.company;

public class Hero {
    private String name;
    private int Health;
    private int Damage;
    private String SuperPower;

    public Hero(String name, int Health, int Damage, String SuperPower){
        System.out.println("Heroes name:" + name);
        System.out.println("Heroes Health:" + Health);
        System.out.println("Heroes Damage:" + Damage);
        System.out.println("Heroes SuperPower:" + SuperPower);
        this.Damage = Damage;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHealth(int Health){
        this.Health = Health;
    }
    public int getHealth(){
        return Health;
    }
    public void setDamage(int Damage){
        this.Damage = Damage;
    }
    public int getDamage(){
        return Damage;
    }
    public void setSuperPower(String SuperPower){
        this.SuperPower = SuperPower;
    }
    public String getSuperPower(){
        return SuperPower;
    }
}
