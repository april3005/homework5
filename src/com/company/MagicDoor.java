package com.company;

public class MagicDoor {

        public Hero[] heroes (){
           
        Hero h1 = new Hero(250, 200, "Physical");
        Hero h2 = new Hero (250, 200, "Magic");
        Hero h3 = new Hero (250, 0, "Medical");
        Hero h4 = new Hero (250, 200, "Kinetic");
        Hero[] heroes = {h1, h2, h3,h4};

        return heroes;


    }
}
