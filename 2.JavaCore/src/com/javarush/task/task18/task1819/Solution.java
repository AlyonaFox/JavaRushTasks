package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String name1 = rd.readLine();
        String name2 = rd.readLine();
        rd.close();
        FileInputStream file1In = new FileInputStream(name1);
        FileInputStream file2 = new FileInputStream(name2);

        byte[] buffer1 = new byte[file1In.available()];
        file1In.read(buffer1);
        file1In.close();

        byte[] buffer2 = new byte[file2.available()];
        file2.read(buffer2);
        file2.close();

        FileOutputStream file1Out = new FileOutputStream(name1); //поток для перезаписи
        file1Out.write(buffer2); //записал второй файл
        file1Out.close(); //закрыл прошлый поток для записи

        file1Out.write(buffer1); //дозаписал первый файл

        file1Out.close();

        }

}
