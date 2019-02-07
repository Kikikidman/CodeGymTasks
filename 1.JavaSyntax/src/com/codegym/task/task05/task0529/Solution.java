package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sumofNum = 0;

        while (true) {
        String a = scanner.nextLine();
        if (a.equals("sum"))
            break;
            sumofNum += Integer.parseInt(a);

        }
            System.out.println(sumofNum);
    }
}