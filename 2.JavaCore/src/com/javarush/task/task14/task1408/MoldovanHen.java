package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public static String countryHen = MOLDOVA;
    int getCountOfEggsPerMonth(){
        return 2000;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - " + countryHen + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

