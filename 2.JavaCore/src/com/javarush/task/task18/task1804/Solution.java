package com.javarush.task.task18.task1804;

        import java.io.FileInputStream;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> repeatСount = new HashMap<>(  );
        ArrayList<Integer> result = new ArrayList<>(  );
        int minRepeat = 0;

        Scanner scanner = new Scanner( System.in );
        String nameFile = scanner.nextLine();
        FileInputStream inputStream = new FileInputStream( nameFile );

        while (inputStream.available() > 0) {
            int n = inputStream.read();
            if (repeatСount.containsKey( n )) repeatСount.put( n, repeatСount.get(n)+1 );
            else repeatСount.put( n, 1 );
        }

        inputStream.close();

        for (HashMap.Entry<Integer, Integer> pair : repeatСount.entrySet()) {
            int value = pair.getValue();
            boolean stop = false;

            if (minRepeat == 0 && stop == false) {
                stop = true;
                minRepeat = value;
            }
            if ( value < minRepeat) minRepeat = value;
        }

        for (HashMap.Entry<Integer, Integer> pair : repeatСount.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (value == minRepeat) result.add( key );
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get( i ));
            if (i != result.size()-1) System.out.print(" ");
        }
    }
}
