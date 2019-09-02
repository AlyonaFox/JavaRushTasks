package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream;
        //Блин, выглядит как будто все нормально. Не понимаю, что им нужно
        //Может быть надо каждый раз проверять имя файла и запрашивать новое? Давай оппробуем
        // Значит дело не в этом, странная херня
        try {
            fileInputStream = getInputStream(sourceFileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        int a;
        // Копирование содержимого файла file.txt
        while ((a = fileInputStream.read()) != -1) {
            fileOutputStream.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
        }

        fileInputStream.close();
        fileOutputStream.close();

    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

