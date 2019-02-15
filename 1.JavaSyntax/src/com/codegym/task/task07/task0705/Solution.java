package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] large = new int[20];
        int[] smallFirst = new int[10];
        int[] smallSecond = new int[10];

        for (int i = 0; i < large.length; i++) {
            large[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++){
            smallFirst[i] = large[i];
        }
        for (int i = 10; i < 20; i++){
            smallSecond[i - 10] = large[i];
            System.out.println(smallSecond[i -10]);
        }
    }
}
