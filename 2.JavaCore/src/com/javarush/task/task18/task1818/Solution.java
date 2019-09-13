package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        String nameFie1 = scanner.nextLine();
        String nameFie2 = scanner.nextLine();
        String nameFie3 = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream( nameFie2 );
        FileInputStream inputStream1 = new FileInputStream( nameFie3 );
        FileOutputStream outputStream= new FileOutputStream( nameFie1, true );

        byte[] buffer1 = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            int count = inputStream.read(buffer1);
            outputStream.write(buffer1, 0, count);
        }

        byte[] buffer2 = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {
            int count = inputStream1.read(buffer2);
            outputStream.write(buffer2, 0, count);
        }

        inputStream.close();
        inputStream1.close();
        outputStream.close();
    }
}
