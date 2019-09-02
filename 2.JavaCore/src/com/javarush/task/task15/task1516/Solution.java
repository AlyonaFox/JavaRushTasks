package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar ;
    public double doubleVar;
    public Double DoubleVar ;
    public boolean booleanVar ;
    public Object ObjectVar;
    public Exception ExceptionVar ;
    public String StringVar ;

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.intVar + "\n" + s.doubleVar + "\n" + s.DoubleVar + "\n" + s.booleanVar + "\n"
                + s.ObjectVar + "\n" + s.ExceptionVar + "\n" + s.StringVar);
    }

}
