package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList cats = new ArrayList();

    public Cat() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            cats.add(cats);
        }

        printCats();
    }

    public static void printCats() {
        System.out.println(cats);
    }
}
