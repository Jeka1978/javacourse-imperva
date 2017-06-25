package com.imperva.polymorphism;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnimalDoctor animalDoctor = new AnimalDoctorImpl();
        animalDoctor.treat(new Dog());
        animalDoctor.treat(new Cat());
    }
}
