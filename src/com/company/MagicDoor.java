package com.company;

public class MagicDoor {

       public Hero[] heroes (){
        Hero[] heroes = {"Warrior", "Wizard","Doctor", "Kinetic"};

        Hero Warrior = new Hero(250, 200, "Physical");
        Hero Wizard = new Hero (250, 200, "Magic");
        Hero Doctor = new Hero (250, 0, "Medical");
        Hero Kinetic = new Hero (250, 200, "Kinetic");

        return heroes;


    }
}
