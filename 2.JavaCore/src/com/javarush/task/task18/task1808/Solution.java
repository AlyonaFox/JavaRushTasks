package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        String nameFile1 = scanner.nextLine();
        String nameFile2 = scanner.nextLine();
        String nameFile3 = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream( nameFile1 );
        FileOutputStream streamWriter2 = new FileOutputStream( nameFile2 );
        FileOutputStream streamWriter3 = new FileOutputStream( nameFile3 );

        if (inputStream.available() > 0) {
            int b1, b2;
            if (inputStream.available()%2 == 0) {
                b1 = inputStream.available()/2;
                b2 = b1;
            } else {
                b2 = (inputStream.available()-1)/2;
                b1 = ((inputStream.available()-1)/2)+1;
            }

            byte[] buffer1 = new byte[b1];
            byte[] buffer2 = new byte[b2];

            int count1 = inputStream.read(buffer1);
            int count2 = inputStream.read(buffer2);

            streamWriter2.write(buffer1, 0, count1);
            streamWriter3.write(buffer2, 0, count2);
        }

        inputStream.close();
        streamWriter2.close();
        streamWriter3.close();
    }
}
