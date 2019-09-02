package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String nameFile = reader.readLine();
        reader.close();

        InputStream inStream = new FileInputStream(nameFile);

        while(inStream.available() > 0){
            int data = inStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }

        inStream.close();
    }
}