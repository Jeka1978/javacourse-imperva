package com.imperva.enums;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person ornit = new Person("Ornit", MaritalStatus.MARRIED);

        System.out.println(ornit.getMaritalStatus());

        MaritalStatus maritalStatus = null;
        try {
            maritalStatus = MaritalStatus.findByDbCode(3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(maritalStatus.getHebrewDesc());


    }
}
