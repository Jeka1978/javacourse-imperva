package com.imperva.outboxing;

import com.imperva.lombok_examples.Person;

import java.util.ArrayList;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Person());
        objects.add(3);


        Integer x = 2;
        Integer y = 5;
        x = x + y;
    }
}
