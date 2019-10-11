package com.company;

import java.util.Random;

public class Boss {
    int health;
    int damage;
    String defenceType;




    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public String getDefenceType() {
                return defenceType;
    }

    public void setDefenceType(String defenceType) {

        this.defenceType = defenceType;
    }

    public static void changeDefenceType () {
        Random r = new Random();
        int randomDefenceType = r.nextInt();
    }
}
