package com.imperva.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("scala");
        strings.add("groovy");


        strings.sort((o1, o2) -> o1.length() - o2.length());









    }
}
