package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = new String[10];
        int[] array2 = new int[10];

        for(int i = 0; i < array2.length; i++){
            array1[i] = scanner.nextLine();
            array2[i] = array1[i].length();
            System.out.println(array2[i]);
        }

    }

}
