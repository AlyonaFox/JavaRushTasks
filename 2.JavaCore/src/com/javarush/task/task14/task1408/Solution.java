package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen1 = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen1.getDescription());

        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen3.getDescription());

        Hen hen4 = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen4.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            if (BelarusianHen.countryHen.equals( country )) return new BelarusianHen();
            if (RussianHen.countryHen.equals( country )) return new RussianHen();
            if (MoldovanHen.countryHen.equals( country )) return new MoldovanHen();
            return new UkrainianHen();
        }
    }


}
