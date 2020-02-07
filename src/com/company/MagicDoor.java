package com.company;

public class MagicDoor {

    public static Hero[] generate(){

        Hero[] heroes= new Hero[4];
          Hero warior=new Hero("adroit",500,25,"fastAttack");
        heroes[0]=warior;
        Hero magic= new Hero("magic",300,55,"superAttack");
        heroes[1]=magic;
        Hero kinetick=new Hero("kinetick",250,35,"SuperEXP");
        heroes[2]=kinetick;
        Hero medic=new Hero("medic",200,25,"heall");heroes[3]=medic;
    return heroes;
}}

