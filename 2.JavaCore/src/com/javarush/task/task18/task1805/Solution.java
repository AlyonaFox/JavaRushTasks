package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(  );
        Scanner scanner = new Scanner( System.in);
        String nameFile = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream( nameFile );

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            if (!list.contains( b )) list.add( b );
        }
        inputStream.close();

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get( i );
        }

        Arrays.sort( result );

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length-1) System.out.print(" ");
        }


    }
}
