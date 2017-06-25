package com.imperva.polymorphism;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class AnimalDoctorImpl implements AnimalDoctor {
    @Override
    public void treat(Animal animal) {

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bringSteak();
        }
        animal.makeVoice();
    }
}
