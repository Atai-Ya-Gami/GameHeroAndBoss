package com.company;

public class Boss {
    public Boss(int BossHealth, int BossDamage, String BossDefenseType){

        System.out.println("Boss Health: " + BossHealth );
        System.out.println("Boss Damage: " + BossDamage );
        System.out.println("Boss Defense Type: " + BossDefenseType );
    }
    private int BossHealth;
    private int BossDamage;
    private String BossDefenseType;

    public void setBossHealth(int BossHealth){
        this.BossHealth = BossHealth;
    }
    public int getBossHealth(){
        return BossHealth;
    }
    public void setBossDamage(int BossDamage){
        this.BossDamage = BossDamage;
    }
    public int getBossDamage(){
        return BossDamage;
    }
    public void setBossDefenseType(String BossDefenseType){
        this.BossDefenseType = BossDefenseType;
    }
    public String getBossDefenseType(){
        return BossDefenseType;
    }
}
