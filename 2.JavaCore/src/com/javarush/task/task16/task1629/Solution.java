package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        Map <Read3Strings, String> stringThree = new HashMap( 2 );

        public void run() {
            BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
            try {
                String s = reader.readLine() + " " + reader.readLine() + " " + reader.readLine();
                stringThree.put( this, s );

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public  void printResult(){
            System.out.println(stringThree.get( this ));
        }
    }
}
