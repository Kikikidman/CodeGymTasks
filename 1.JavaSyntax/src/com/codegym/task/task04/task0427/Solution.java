package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import sun.security.util.Length;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0 && a < 1000) {
            String result = "";

            if (a > 99) {
                result = "three-digit number";
            } else if (a > 9) {
                result = "two-digit number";
            } else {
                result = "single-digit number";
            }

            if (a % 2 == 0) {
                result = "even " + result;
            } else {
                result = "odd " + result;
            }
            System.out.println(result);
        }
    }
}


//        if (length(a) == 1 && a % 2 == 0){
//            System.out.print("even single-digit number");
//        } else if (length(a) == 1 && a % 2 != 0){
//            System.out.print("odd single-digit number");
//        } else if (length(a) == 2 && a % 2 == 0){
//            System.out.print("even two-digit number");
//        }else if (length(a) == 2 && a % 2 != 0){
//            System.out.print("odd two-digit number");
//        }else if (length(a) == 3 && a % 2 == 0){
//            System.out.print("even three-digit number");
//        }else if (length(a) == 3 && a % 2 != 0){
//            System.out.print("odd three-digit number");
//        }else if (a < 0 || a > 999){

//        }
//    }
//    private static int length(int num){
//
//        String s = Integer.toString(num);
//        int digit = s.length();
//        return digit;

