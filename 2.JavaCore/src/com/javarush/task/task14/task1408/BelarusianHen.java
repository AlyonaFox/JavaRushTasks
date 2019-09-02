package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public static String countryHen = BELARUS;
    int getCountOfEggsPerMonth(){
        return 1000;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + countryHen + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

