package com.imperva.flow_control;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("java", "c#", "groovy");

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println("s = " + s);
        }

        for (String string : strings) {
            System.out.println(string);
        }

//        strings.forEach(System.out::println);






    }
}



