package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> repeatСount = new HashMap<>(  );
        ArrayList<Integer> result = new ArrayList<>(  );

        Scanner scanner = new Scanner( System.in );
        String nameFile = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream( nameFile );

        while (inputStream.available() > 0) {
            int n = inputStream.read();
            if (repeatСount.containsKey( n )) repeatСount.put( n, repeatСount.get(n)+1 );
            else repeatСount.put( n, 1 );
        }

        inputStream.close();

        int maxRepeat = 0;

        for (HashMap.Entry<Integer, Integer> pair : repeatСount.entrySet()) {
            int value = pair.getValue();
            if ( value > maxRepeat) maxRepeat = value;
        }

        for (HashMap.Entry<Integer, Integer> pair : repeatСount.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (value == maxRepeat) result.add( key );
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get( i ));
            if (i != result.size()-1) System.out.print(" ");
        }
    }
}
