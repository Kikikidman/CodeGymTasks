package com.codegym.task.task08.task0827;


import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 7 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date odd = new Date(date);
        Date current = new Date(odd.getYear(), 0, 1);

        long days = (odd.getTime() - current.getTime()) / 1000 / 3600 / 24;
        return days % 2 == 0;
    }
}
