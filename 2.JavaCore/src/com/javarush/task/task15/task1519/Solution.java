package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Base64;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        while (true) {
            String s = reader.readLine();
            if (s.equals( "exit" )) break;
            while (true) {
                try {
                    if (s.contains( "." )) {
                        print( Double.parseDouble( s ) );
                        break;
                    }
                    if (Integer.parseInt( s ) > 0 && Integer.parseInt( s ) < 128) {
                        print( Short.parseShort( s ) );
                        break;
                    }
                    if (Integer.parseInt( s ) <= 0 || Integer.parseInt( s ) >= 128) {
                        print( Integer.parseInt( s ) );
                        break;
                    }
                } catch (Exception e) {
                    print( s );
                    break;
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
