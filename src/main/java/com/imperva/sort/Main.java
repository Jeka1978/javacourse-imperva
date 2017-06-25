package com.imperva.sort;

import com.imperva.lombok_examples.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "scala", "groovy", "c#");
        Collections.sort(list);

        List<Person> people = Arrays.asList(new Person());

        System.out.println(list);
    }
}
