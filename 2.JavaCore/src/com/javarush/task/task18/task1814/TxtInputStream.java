package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    FileInputStream inputStream;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        if (fileName.contains( ".txt" ) && !fileName.contains( "txt." )) {
            try {
                inputStream = new FileInputStream( fileName );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

