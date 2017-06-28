package com.imperva.exceptions;

import java.io.File;

/**
 * Created by Evegeny on 28/06/2017.
 */
@Deprecated
public interface FileService {
    void addTextToFile(File file, String text);
}
