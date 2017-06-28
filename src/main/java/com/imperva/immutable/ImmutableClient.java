package com.imperva.immutable;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class ImmutableClient {
    private final String name;
    private final int age;

     ImmutableClient(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
