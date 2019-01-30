package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s =  Integer.toString(number);

        char[] chars = s.toCharArray();
        int i1 = Character.getNumericValue(chars[0]);
        int i2 = Character.getNumericValue(chars[1]);
        int i3 = Character.getNumericValue(chars[2]);
        int sum = i1 + i2 + i3;
        
        return sum;
    }
}