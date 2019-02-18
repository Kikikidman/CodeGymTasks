package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[15];
        int max;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (i % 2 == 0) {
                sumEven += num[i];
            }
            else {
                sumOdd += num[i];
            }
            }
            if (sumEven > sumOdd) {
                System.out.println("Even-numbered houses have more residents.");
            } else {
                System.out.println("Odd-numbered houses have more residents.");
            }

        }
    }
