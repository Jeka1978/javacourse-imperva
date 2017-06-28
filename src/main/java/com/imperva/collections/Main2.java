package com.imperva.collections;

import com.imperva.enums.MaritalStatus;
import com.imperva.enums.Person;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class Main2 {
    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();
        map.put(new Person("jeka", MaritalStatus.MARRIED), 1);
        Set<Person> people = map.keySet();
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase("jeka")) {
                person.setMaritalStatus(MaritalStatus.SINGLE);
            }
        }

        System.out.println(map);
    }
}
