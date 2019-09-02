package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String strLine = null;
        StringBuilder sb = new StringBuilder();

        @Override
        public void run() {
            try {
                strLine = null;
                FileInputStream ireader = new FileInputStream(fullFileName);
                BufferedReader br = new BufferedReader(new InputStreamReader(ireader));

                while ((strLine = br.readLine()) != null) {
                    sb.append(strLine);
                    sb.append(" ");
                }
                ireader.close();
                br.close();
            } catch (Exception e) {
                System.out.println("Ошибка чтения файла!");
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return sb.toString();
        }
    }
}
