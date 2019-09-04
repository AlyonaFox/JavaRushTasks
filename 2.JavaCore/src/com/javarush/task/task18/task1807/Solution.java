package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );

        char character = ',';
        int ascii = (int) character;

        int count = 0;

        FileInputStream inputStream = new FileInputStream( scanner.nextLine() );

        while (inputStream.available() > 0) {
           int ch =  inputStream.read();
           if (ch == ascii) count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
