package com.imperva.files;

import com.imperva.lombok_examples.Person;

import java.io.*;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\temp\\imperva\\a.txt");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("Ran",40));
        oos.close();




    }
}
