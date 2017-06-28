package com.imperva.exceptions;

import lombok.Data;
import lombok.SneakyThrows;
import sun.management.FileSystemImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Evegeny on 28/06/2017.
 */
@Data
public class FileServiceImpl implements FileService {
    @Override
    @SneakyThrows
    public void addTextToFile(File file, String text) {

        if (file.exists()) {

            FileInputStream fileInputStream = new FileInputStream(file);

            fileInputStream.read();
        }

    }


}
