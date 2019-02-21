package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> fruit = new HashMap<String, String>();
        fruit.put("watermelon", "melon");
        fruit.put("banana", "fruit");
        fruit.put("cherry", "fruit");
        fruit.put("pear", "fruit");
        fruit.put("cantaloupe", "melon");
        fruit.put("blackberry", "fruit");
        fruit.put("ginseng", "root");
        fruit.put("strawberry", "fruit");
        fruit.put("iris", "flower");
        fruit.put("potato", "tuber");

        for(HashMap.Entry<String, String> pair : fruit.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
