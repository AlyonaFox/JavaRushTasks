package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    public static String countryHen = UKRAINE;
    int getCountOfEggsPerMonth(){
        return 10000000;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + countryHen + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
