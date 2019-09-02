package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        FileInputStream fileInputStream = new FileInputStream(reader.readLine()) ;
        BufferedReader fileReader = new BufferedReader( new InputStreamReader( fileInputStream ) );

        ArrayList<Integer> even = writeEven( fileReader );
        fileInputStream.close();
        Collections.sort(even);
        outPrintSortEven(even);
    }

    public static ArrayList<Integer> writeEven (BufferedReader fileReader) throws IOException {
        ArrayList<Integer> even = new ArrayList<>(  );
        String strNumber;
        while ((strNumber = fileReader.readLine()) != null) {
            int number = Integer.parseInt( strNumber );
            if(number%2 == 0) even.add(number);
        }
        return even;
    }

    public  static void outPrintSortEven ( ArrayList<Integer> even) {
        for (Integer number : even) System.out.println(number);
    }
}
