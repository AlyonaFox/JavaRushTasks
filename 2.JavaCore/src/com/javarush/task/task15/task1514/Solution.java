package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(4.5, "a"  );
        labels.put(4.6, "agh"  );
        labels.put(7.5, "afs"  );
        labels.put(9.5, "adfz"  );
        labels.put(0.5, "af"  );
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }

}
