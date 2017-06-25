package com.imperva.strategy;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Sword implements Weapon {
    @Override
    public void kick(Character c1, Character c2) {
        System.out.println("sword is cutting enemy's head");
    }
}
