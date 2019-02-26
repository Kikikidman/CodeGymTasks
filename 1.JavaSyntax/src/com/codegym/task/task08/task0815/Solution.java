package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap<>();
        names.put("Sim", "Sim");
        names.put("Tom", "Tom");
        names.put("Arbus", "Arbus");
        names.put("Baby", "Tom");
        names.put("Cat", "Cat");
        names.put("Dog", "Dog");
        names.put("Eat", "Tom");
        names.put("Food", "Food");
        names.put("Gevey", "Gevey");
        names.put("Hugs", "Hugs");

        return names;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<String, String > pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name))
            {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<String, String > pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(lastName))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
