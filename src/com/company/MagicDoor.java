package com.company;

public class MagicDoor {

    public static String heroes (){
        String[] heroes = new String [4];
        heroes [0] = "Warrior";
        heroes [1] = "Wizard";
        heroes [2] = "Doctor";
        heroes [3] = "Kinetic";

        Hero Warrior = new Hero(250, 200, "Physical");
        Hero Wizard = new Hero (250, 200, "Magic");
        Hero Doctor = new Hero (250, 0, "Medical");
        Hero Kinetic = new Hero (250, 200, "Kinetic");

        return heroes();


    }
}
