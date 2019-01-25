package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
       System.out.println(convertEurToUsd(12, 0.88));
        System.out.println(convertEurToUsd(8, 0.15));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        double m;
        m = eur * exchangeRate;
        return m;
    }
}
