package com.codegym.task.task08.task0818;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ivan", 600);
        map.put("Roman", 600);
        map.put("Ivanka", 700);
        map.put("Romanka", 400);
        map.put("Ivanshka", 300);
        map.put("Romashka", 4567);
        map.put("Ivanidze", 23423);
        map.put("Romanidze", 32);
        map.put("Ivan-chan", 222);
        map.put("Roman-kun", 444);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> remove = map.entrySet().iterator();
        while (remove.hasNext()) {
            Map.Entry<String, Integer> pair = remove.next();
            if (pair.getValue() < 500){
                remove.remove();
            }
        }
    }
    public static void main(String[] args) {

    }
}