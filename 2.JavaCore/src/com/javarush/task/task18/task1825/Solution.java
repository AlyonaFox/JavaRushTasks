package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap <Integer, String> nameFiles = new TreeMap<Integer, String>(  );
        ArrayList<String> fileNames = new ArrayList<>(  );
        Scanner scanner = new Scanner( System.in );
        while (true) {
            String nameFile = scanner.nextLine();
            if (nameFile.equals( "end" )) break;
            fileNames.add( nameFile );
        }

//        D:\test\test.txt.part1
        String nameFileWrite = nameFileWrite(fileNames.get( 0 ));

        for (String fileName : fileNames) {
            nameFiles.put( id(fileName), fileName );
        }

        FileOutputStream outputStream = new FileOutputStream( nameFileWrite, true );

        for (Map.Entry<Integer, String> pair : nameFiles.entrySet()) {
            String nameFile = pair.getValue();
            FileInputStream inputStream = new FileInputStream( nameFile );

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            outputStream.write( buffer );
            outputStream.flush();
        }
        outputStream.close();
    }

    public static int id (String fileName) {
        String fileNameReverse = new StringBuffer(fileName).reverse().toString();
        String idReverse = fileNameReverse.substring( 0, fileNameReverse.indexOf( "t" ) );
        String id = new StringBuffer(idReverse).reverse().toString();
        return Integer.parseInt( id );
    }

    public static String nameFileWrite (String fileName) {
        String fileNamesRevers = new StringBuffer(fileName).reverse().toString();
        String nameFileWriteRevers = fileNamesRevers.substring( fileNamesRevers.indexOf( "trap." ) + 5 );
        return  new StringBuffer(nameFileWriteRevers).reverse().toString();
    }
}
