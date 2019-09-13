package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner scanner = new Scanner( System.in );
            String fileName = scanner.nextLine();

            FileInputStream inputStream;
            try {
                inputStream = new FileInputStream( fileName );
            } catch (FileNotFoundException e) {
                System.out.println( fileName );
                break;
            }

            inputStream.close();
        }

    }
}
