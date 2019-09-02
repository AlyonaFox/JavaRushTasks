package com.javarush.task.task15.task1531;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0 ) return "0";
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++){
            BigInteger multiply = new BigInteger(Integer.toString(i));
            result = result.multiply(multiply);
        }
        return result.toString();
    }
}
