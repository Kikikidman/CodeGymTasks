package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = 366;
        int c = 365;

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Number of days in the year: " + s);
        } else {
            System.out.println("Number of days in the year: " + c);
        }
    }

}
