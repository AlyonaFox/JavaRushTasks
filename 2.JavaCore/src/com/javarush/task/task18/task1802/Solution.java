package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner( System.in );
        String nameFile = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(nameFile);
        int min = inputStream.read();

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            if (b < min) min = b;
        }

        inputStream.close();;
        System.out.println(min);
    }
}
