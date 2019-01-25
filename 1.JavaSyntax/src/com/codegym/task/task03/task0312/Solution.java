package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    public static int convertToSeconds(int hour){
        int a = hour * 3600;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(9));
        System.out.println(convertToSeconds(14));

    }
}
