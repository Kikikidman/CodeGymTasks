package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 0 && num % 2 == 0){
            System.out.print("Negative even number");
        } else if (num < 0 && num % 2 != 0){
            System.out.print("Negative odd number");
        } else if (num == 0){
            System.out.print("Zero");
        } else if (num > 0 && num % 2 == 0){
            System.out.print("Positive even number");
        } else if (num % 2 == 1 && num > 0){
            System.out.print("Positive odd number");
        }

    }
}
