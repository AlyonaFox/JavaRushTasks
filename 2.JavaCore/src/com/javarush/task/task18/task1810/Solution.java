package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner( System.in );

        boolean stop = false;

        while (!stop) {
            String nameFile = scanner.nextLine();
            FileInputStream inputStream = new FileInputStream( nameFile );
            byte[] buffer = new byte[inputStream.available()];
            if (buffer.length < 1000) {
                stop = true;
                throw new DownloadException();
            }
            inputStream.close();
        }

    }

    public static class DownloadException extends Exception {

    }
}
