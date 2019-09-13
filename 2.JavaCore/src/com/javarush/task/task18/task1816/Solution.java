package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz".toUpperCase();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream( args[0] )));

        int count = 0;

        while (true) {
            String s = reader.readLine();
            if (s == null) break;
            char [] str = s.toCharArray();

            for (int i = 0; i < str.length; i++){
                String s1 = String.valueOf(str[i]);
                if (alphabet.contains( s1 )) count++;
            }
        }

        System.out.println(count);

        reader.close();
    }
}
