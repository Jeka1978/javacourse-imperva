package com.imperva.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class FileService {
    public void printFileContent(File file) throws FileNotFoundException {
        new FileInputStream(file);

    }
}
