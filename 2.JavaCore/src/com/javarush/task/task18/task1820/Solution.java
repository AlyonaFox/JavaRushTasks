package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner( System.in );
        String fileName1 = scanner1.nextLine();
        String fileName2 = scanner1.nextLine();

//        FileInputStream inputStream = new FileInputStream( "D:\\test\\test1.txt" );
//        FileOutputStream outputStream = new FileOutputStream( "D:\\test\\test2.txt" );
//
        FileInputStream inputStream = new FileInputStream( fileName1 );
        FileOutputStream outputStream = new FileOutputStream( fileName2 );


        ArrayList<Integer> numbers = new ArrayList<>(  );
        Scanner scanner = new Scanner(inputStream).useDelimiter( " " );
        while (scanner.hasNext()) {
            String strNumber = scanner.next();
            double number = Double.parseDouble( strNumber );
            int roundNumber = (int)Math.round(number);
            numbers.add( roundNumber );
        }

        for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get( i );
            String s = Integer.toString( n );
            outputStream.write( s.getBytes() );
            if (i < numbers.size()-1) outputStream.write( ' ');
        }

        inputStream.close();
        outputStream.close();
    }
}
