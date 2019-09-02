package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        System.out.println(lines);

    }
    static {

        File file = new File(Statics.FILE_NAME);
        String string;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            while ((string=br.readLine())!=null) {
                Solution.lines.add(string);

            }
            br.close();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
