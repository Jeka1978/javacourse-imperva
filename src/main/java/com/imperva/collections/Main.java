package com.imperva.collections;

import com.imperva.lombok_examples.Person;
import com.imperva.polymorphism.Animal;
import com.imperva.polymorphism.Cat;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());

        Animal animal = animals.get(0);


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);

        HashSet<String> set = new HashSet<>();
        set.add("java");
        System.out.println(set);


    }
}
