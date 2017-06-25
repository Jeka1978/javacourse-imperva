package com.imperva.lombok_examples;

import static java.lang.Math.*;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ornit",18);
        System.out.println(person);
        Person person2 = new Person("Ornit",18);
        System.out.println(person.equals(person2));



    }
}
