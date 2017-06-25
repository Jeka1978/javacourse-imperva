package com.imperva.lombok_examples;

import lombok.*;

import java.io.Serializable;

/**
 * Created by Evegeny on 25/06/2017.
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable{
    private String name;
    private transient int age;

    public Person withName(String newName) {
        return new Person(newName, age);
    }


}
