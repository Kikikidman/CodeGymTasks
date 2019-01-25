package com.codegym.task.task03.task0304;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {
        //write your code here
        double m = 0.10;
        double n = i * m;
        return i + n;

    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
