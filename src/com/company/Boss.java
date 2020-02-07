package com.company;

import java.util.Random;



public abstract class Boss {


    private int health;
    private int damage;
    private static int[] protection;
    private static int[]bossProtection;

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

    public int[] getProtection() {
        return protection;
    }

    public void setProtection(int[] protection) {
        this.protection = protection;
    }

    public int[] getBossProtection() {
        return bossProtection;
    }

    public void setBossProtection(int[] bossProtection) {
        this.bossProtection = bossProtection;
    }

    public static void changeBossDeffence() {
        Random r = new Random();
        int randomIndex = r.nextInt(protection.length);
      int i  = bossProtection[randomIndex];
    }


    }












