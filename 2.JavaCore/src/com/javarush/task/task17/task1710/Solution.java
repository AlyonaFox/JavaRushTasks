package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add( Person.createMale( "Иванов Иван", new Date() ) );  //сегодня родился    id=0
        allPeople.add( Person.createMale( "Петров Петр", new Date() ) );  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        String name;
        String sex;
        String bd;
        int id;
        SimpleDateFormat dateformat = new SimpleDateFormat( "dd-MMM-yyyy", Locale.ENGLISH );
        Date date = null;
        
        if (args[0].equals( "-c" )) {
            name = args[1];
            sex = args[2];
            bd = args[3];
            try {
                date = new SimpleDateFormat( "dd/MM/yyyy", Locale.ENGLISH ).parse( bd );
            } catch (ParseException e) {
            }
            Person person = Person.createMale( name, date );
            
            if (sex.equals( "м" )) {
                person.setSex( Sex.MALE );
            } else person.setSex( Sex.FEMALE );
            allPeople.add( person );
            
            System.out.println( allPeople.indexOf( person ) );
        
        } else if (args[0].equals( "-u" )) {
            id = Integer.parseInt( args[1] );
            name = args[2];
            sex = args[3];
            bd = args[4];
            Person person = allPeople.get( id );
            person.setName( name );
            
            if (sex.equals( "м" )) {
                person.setSex( Sex.MALE );
            } else person.setSex( Sex.FEMALE );
            try {
                date = new SimpleDateFormat( "dd/MM/yyyy", Locale.ENGLISH ).parse( bd );
            } catch (ParseException e) {
            }
           
            person.setBirthDate( date );
        
        } else if (args[0].equals( "-d" )) {
            id = Integer.parseInt( args[1] );
            Person person = allPeople.get( id );
            person.setName( null );
            person.setSex( null );
            person.setBirthDate( null );
        
        } else if (args[0].equals( "-i" )) {
            id = Integer.parseInt( args[1] );
            Person person = allPeople.get( id );
            System.out.println( String.format( "%s %s %s", person.getName(), person.getSex() == Sex.MALE ? "м" : "ж", dateformat.format( person.getBirthDate() ) ) );
        }
    }
}
