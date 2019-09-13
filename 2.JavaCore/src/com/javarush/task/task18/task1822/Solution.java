package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        String fileName = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream( fileName );

        BufferedReader reader = new BufferedReader( new InputStreamReader( inputStream ) );

        while (true) {
            String s = reader.readLine();
            String[] stringsAll = s.split( " " );
            if (args[0].equals( stringsAll[0] )) {
                System.out.println(s);
                break;
            }
        }

        inputStream.close();
        reader.close();


    }
}
