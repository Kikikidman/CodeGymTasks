package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];

        for (int i = 0; i < 8; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = array.length - 1; i >= 0; i-- ){
            System.out.println(array[i]);
        }
    }
}