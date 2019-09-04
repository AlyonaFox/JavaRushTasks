package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner( System.in );
        String nameFile = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream(nameFile);
        int max = inputStream.read();

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            if (b > max) max = b;
        }

        inputStream.close();;
        System.out.println(max);
    }
}
