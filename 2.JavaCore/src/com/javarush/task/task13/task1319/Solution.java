package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        File nameFile = new File(reader.readLine());

        BufferedWriter outStream = new BufferedWriter( new FileWriter(nameFile) );

        while (true) {
            String string = reader.readLine();
            outStream.write(string + "\n");
            if (string.equals( "exit" )) break;
       }
        outStream.close();
    }
}
