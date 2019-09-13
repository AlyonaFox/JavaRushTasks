package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner( System.in );
        while (true) {
            String fileName = scanner.nextLine();
            if (fileName.equals( "exit" )) break;
            ReadThread thread = new ReadThread( fileName );
            thread.start();
            thread.join();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void run() {
            Map<Integer, Integer> countByte = new HashMap<Integer, Integer>();
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream( this.fileName );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (true) {
                try {
                    if (!(inputStream.available() > 0)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int b = 0;
                try {
                    b = inputStream.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!countByte.containsKey( b )) {
                    countByte.put( b, 1 );
                } else {
                    int value = countByte.get( b ) + 1;
                    countByte.replace( b, value );
                }
            }

            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int maxKey = 0;
            int maxValue = 0;

            for (Map.Entry<Integer, Integer> pair : countByte.entrySet()) {
                int value = pair.getValue();
                int key = pair.getKey();

                if (value > maxValue) {
                    maxValue = value;
                    maxKey = key;
                }
            }

            resultMap.put( fileName, maxKey );
        }
    }
}
