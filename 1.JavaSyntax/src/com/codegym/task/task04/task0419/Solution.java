package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (Math.max(a, b) > Math.max(c, d)){
            System.out.println(Math.max(a, b));
        } else {
            System.out.println(Math.max(c, d));
        }
    }
}
