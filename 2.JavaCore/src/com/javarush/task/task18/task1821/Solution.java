package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream( args[0] );

        byte[] data;
        char[] characters = new char[10];
        if (inputStream.available() > 0) {
            data = new byte[inputStream.available()];
            inputStream.read(data);
            characters = new String(data).toCharArray();
        }

        inputStream.close();

        TreeMap<Character, Integer> symbolCount = new TreeMap<>(  );

        for (int i = 0; i < characters.length; i++) {
            char symbol = characters[i];
            if (!symbolCount.containsKey( symbol ))
                symbolCount.put( symbol, 1 );
            else {
                int value = symbolCount.get(symbol) + 1;
                symbolCount.replace( symbol, value);
            }
        }

        for ( Map.Entry<Character, Integer> pair : symbolCount.entrySet()) {
            char key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
