package com.imperva.strategy;

import lombok.Setter;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Knight implements Character {
    @Setter
    private Weapon weapon = new Sword();
    @Override
    public void kick(Character character) {
       weapon.kick(this,character);
    }
}
