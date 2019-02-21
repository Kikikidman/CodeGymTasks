package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> list = new HashSet<String>();
        Collections.addAll(list, "watermelon", "banana", "cherry", "pear",
                "cantaloupe", "blackberry", "ginseng", "strawberry", "iris", "potato");

        for (String a : list){
            System.out.println(a);
        }

    }
}
