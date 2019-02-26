package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JUNE;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Ivan", df.parse("JULY 1 1980"));
        map.put("Ivanka", df.parse("SEPTEMBER 1 1980"));
        map.put("Ivashka", df.parse("JANUARY 1 1980"));
        map.put("Ivanidze", df.parse("MARCH 1 1980"));
        map.put("Arnold", df.parse("DECEMBER 6 1980"));
        map.put("Wesley", df.parse("JUNE 23 1980"));
        map.put("Chuck", df.parse("JUNE 2 1980"));
        map.put("Batman", df.parse("MAY 4 1980"));
        map.put("Robin", df.parse("JUNE 3 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> remove = map.entrySet().iterator();
        while (remove.hasNext()) {
            Map.Entry<String, Date> pair = remove.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
            remove.remove();
            }
        }
    }
    public static void main(String[] args) {

    }
}
