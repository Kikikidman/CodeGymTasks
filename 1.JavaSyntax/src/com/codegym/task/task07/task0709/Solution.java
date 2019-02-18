package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            strings.add(i, s);
        }
        for (int a = 0; a < strings.size(); a++) {
            int min = 0;
            for (int b = 0; b < strings.size(); b++)
                if (strings.get(a).length() <= strings.get(b).length())
                    min++;
            if (min == 5) {
                System.out.println(strings.get(a));
            }
        }
    }
}
