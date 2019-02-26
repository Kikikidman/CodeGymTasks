package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> hasSet = new HashSet<>();
        for(int i = 0; i < 20;i++){
            hasSet.add(i);
        }
        return hasSet;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        for(Iterator<Integer> iterator = set.iterator(); iterator.hasNext();){
            Integer element = iterator.next();
            if (element > 10){
            iterator.remove();
            }
        }


    return set;
    }

    public static void main(String[] args) {

    }
}
