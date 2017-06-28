package com.imperva.collections;

import com.imperva.lombok_examples.Person;
import com.imperva.polymorphism.Animal;
import com.imperva.polymorphism.Cat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> actors = new ArrayList<>();
        actors.add("Arnold");
        actors.add("Stallone");
        actors.add("Chuck Norris");
        actors.add("Brus Lee");

        String actorToRemove = "Arnold";

        actors.removeIf(actor -> actor.equalsIgnoreCase(actorToRemove));

        System.out.println(actors);









    }
}
