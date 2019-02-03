package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);

        if (a != b) {
            System.out.println(Math.min(a, b));
        } else {
            System.out.println(a + " " + b);
        }
    }
}