package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
            FileInputStream inputStream = new FileInputStream(args[0]);
            int countWhite = 0;
            int countAll = inputStream.available();

            while (inputStream.available() > 0){
                int value = inputStream.read();
                if (value == 32)
                    countWhite++;
            }
            float value = (float)countWhite / countAll * 100;

            System.out.println(String.format("%.2f", value));
            inputStream.close();
    }
}
