package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            strings.add(i, s);
        }
        for (int a = 0; a < strings.size(); a++) {
            int max = 0;
            for (int b = 0; b < strings.size(); b++)
                if (strings.get(a).length() >= strings.get(b).length())
                    max++;
            if (max == 5) {
                System.out.println(strings.get(a));
            }
        }
    }
}


