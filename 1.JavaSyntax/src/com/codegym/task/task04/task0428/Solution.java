package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        positiveNumCount(a, b, c);
    }

    public static void positiveNumCount(int a, int b, int c){
        int count = 0;

        if (a < 1 && b < 1 && c < 1)
            System.out.print(0);
        else {
            if (a > 0)
                count += 1;
            if (b > 0)
                count += 1;
            if (c > 0)
                count += 1;
            System.out.println(count);
        }
//        if (a > 0 && b > 0 && c > 0) {
//            System.out.println(3);
//        } else if ((a <= 0 && b > 0 && c > 0) || (a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0)){
//            System.out.println(2);
//        } else if ((a > 0 && b <= 0 && c < 0) || (a <= 0 && b > 0 && c <= 0) || (a <= 0 && b <= 0 && c > 0)){
//            System.out.println(1);
//        } else if (a <= 0 && b <= 0 && c <= 0) {
//            System.out.println(0);
//        }

    }
}
