package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public static String countryHen = RUSSIA;
    int getCountOfEggsPerMonth(){
        return 1500;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + countryHen + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
