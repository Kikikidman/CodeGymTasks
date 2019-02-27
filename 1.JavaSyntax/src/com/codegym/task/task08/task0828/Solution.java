package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> dates = new HashMap<>();
        dates.put("January", 1);
        dates.put("February", 2);
        dates.put("March", 3);
        dates.put("April", 4);
        dates.put("May", 5);
        dates.put("June", 6);
        dates.put("July", 7);
        dates.put("August", 8);
        dates.put("September", 9);
        dates.put("October", 10);
        dates.put("November", 11);
        dates.put("December", 12);

        String month = scanner.nextLine();
        Iterator<Map.Entry<String, Integer>> iterator = dates.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if(key.equals(month)){
                System.out.println(key + " is month " + value);
            }
        }

    }
}
