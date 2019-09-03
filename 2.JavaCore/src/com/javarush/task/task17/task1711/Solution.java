package com.javarush.task.task17.task1711;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    createPersones( args );
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    updatePersones( args );
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    deletePersones( args );
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    showPersones( args );
                }
                break;
        }
    }

    public static void createPersones(String[] args) {
        for (int i = 1; i < args.length; i += 3) {
            String name = args[i];
            String strSex = args[i+1];
            String strBirthDate = args[i+2];

            try {
                Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(strBirthDate);
                if (strSex.equals( "м" ))
                    allPeople.add( Person.createMale(name, birthDate ));
                else
                    allPeople.add(Person.createFemale( name, birthDate ));

            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(allPeople.size()-1);
        }
    }

    public static void updatePersones(String[] args) {
        for (int i = 1; i < args.length; i += 4) {
            int id = Integer.parseInt( args[i] );
            Person person = allPeople.get( id );
            person.setName( args[i+1] );

            String strSex = args[i+2];
            if (strSex.equals( "м" )) {
                person.setSex( Sex.MALE );
            } else {
                person.setSex( Sex.FEMALE );
            }

            String strBirthDate = args[i+3];
            try {
                Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(strBirthDate);
                person.setBirthDate( birthDate );
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deletePersones(String[] args) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt( args[i] );
            Person person = allPeople.get( id );
            person.setName( null );
            person.setSex( null );
            person.setBirthDate( null );
        }
    }

    public static void showPersones(String[] args) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt( args[i] );
            Person person = allPeople.get( id );
            String strSex;
            if (person.getSex() == Sex.MALE) {
                strSex = "м";
            } else {
                strSex = "ж";
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String strBirthDate = dateFormat.format( person.getBirthDate() );
            String strPerson = person.getName() + " " + strSex + " " + strBirthDate;
            System.out.println(strPerson);
        }
    }
}
