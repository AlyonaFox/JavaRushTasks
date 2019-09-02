package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
         while (true) {
             Movie movie;
             String key = reader.readLine();
             if ("soapOpera".equals(key)) {
                 movie = MovieFactory.getMovie(key);
                 System.out.println(movie.getClass().getSimpleName());
             }
             else if ("cartoon".equals( key )) {
                 movie = MovieFactory.getMovie(key);
                 System.out.println(movie.getClass().getSimpleName());
             }
             else if  ("thriller".equals( key )){
                 movie = MovieFactory.getMovie(key);
                 System.out.println(movie.getClass().getSimpleName());
             }
             else {
                 movie = MovieFactory.getMovie(key);
                 break;
             }
         }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) movie = new SoapOpera();
            if ("cartoon".equals( key )) movie = new Cartoon();
            if ("thriller".equals( key )) movie = new Thriller();


            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {}

    static class Thriller extends Movie {}
}
