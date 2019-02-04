package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Integer[] tasksort = {a, b, c};

        Arrays.sort(tasksort, Collections.reverseOrder());
        for (int i = 0; i < tasksort.length; i++) {
            System.out.print(tasksort[i] + "  ");
        }
    }
}
