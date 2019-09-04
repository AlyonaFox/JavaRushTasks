package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        String nameFile1 = scanner.nextLine();
        String nameFile2 = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream( nameFile1 );
        FileOutputStream outputStream = new FileOutputStream( nameFile2 );

        ArrayList<Integer>  numbers = new ArrayList<>( inputStream.available());

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            numbers.add( b );
        }
        inputStream.close();

        for (int i = numbers.size()-1; i >= 0 ; i--){
            int n = numbers.get( i );
            outputStream.write( n );
        }

        outputStream.close();
    }
}
