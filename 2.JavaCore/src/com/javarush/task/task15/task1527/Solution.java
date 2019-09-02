package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String paramsUrl = url.substring(url.indexOf("?")+1);
        String delimeter = "&";
        String[] params = paramsUrl.split(delimeter);
        LinkedHashMap <String, String> parsedParams = new LinkedHashMap <>();


        for (String param : params){
            if(param.contains("=")) {
                String p = param.substring(0, param.indexOf("="));
                String a = param.substring(param.indexOf("=")+1);
                parsedParams.put(p, a);
            } else {
                parsedParams.put(param, "");
            }
        }

        Set<String> keys = parsedParams.keySet();
        String keysStr = String.join(" ", keys);
        System.out.println(keysStr);

        for (Map.Entry<String, String> entry: parsedParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("obj")) {
                try {
                    alert(Double.parseDouble(value));
                } catch (NumberFormatException e){
                    alert(value);
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
