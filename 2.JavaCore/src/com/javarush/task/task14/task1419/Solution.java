package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.NotActiveException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try{
            int x = 0;
            if (x == 0)
                throw new IllegalMonitorStateException();
        }catch (IllegalMonitorStateException e){
            exceptions.add(e);
        }

        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[4]);
        }catch (ArrayIndexOutOfBoundsException e2) {
            exceptions.add( e2 );
        }

        try {
            int x = 0;
            if (x == 0)
                throw new ArrayStoreException();
        }catch (ArrayStoreException e){
            exceptions.add(e);
        }

        try {
            String str = "easysteps2buildwebsite";
            System.out.println(str.length());
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e4) {
            exceptions.add(e4);
        }

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e5) {
            exceptions.add(e5);
        }

        int r = -10;
        int b = -1000;
        try {
            int[] asd = new int[r + b];

        } catch (NegativeArraySizeException e6) {
            exceptions.add(e6);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e7) {
            exceptions.add(e7);
        }

        String s = null;
        try {
            Object x = new Integer(0);
            s = (String) x;
        } catch (ClassCastException e8) {
            exceptions.add(e8);
        }

        try {
            float i = 1 / 0;

        } catch (Exception e9) {
            exceptions.add(e9);
        }

        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e2) {
            exceptions.add(e2);
        }
    }
}
