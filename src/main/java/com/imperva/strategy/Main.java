package com.imperva.strategy;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        String str = "java";
        str = str.toUpperCase();
        System.out.println("str = " + str);

        King king = new King();
        Elf elf = new Elf();
        king.kick(elf);
        king.kick(elf);
        king.kick(elf);
        elf.kick(king);
        king.setWeapon(new Knife());
        king.kick(elf);
    }
}
