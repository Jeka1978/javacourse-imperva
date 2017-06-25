package com.imperva.polymorphism;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Dog implements Animal {

    public void bringSteak() {
        System.out.println("This is your steak!!!");
    }

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
