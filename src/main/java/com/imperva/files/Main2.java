package com.imperva.files;

import com.imperva.lombok_examples.Person;

import java.io.*;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("c:\\temp\\imperva\\a.txt");


        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();



    }
}
