package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int mid = a + b + c - (min + max);
        System.out.print(mid);
    }
}