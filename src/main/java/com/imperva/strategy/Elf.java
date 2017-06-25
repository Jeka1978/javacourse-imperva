package com.imperva.strategy;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Elf implements Character {
    @Override
    public void kick(Character character) {
        System.out.println("elf kicking with an bow " + character.getClass().getSimpleName());
    }
}
