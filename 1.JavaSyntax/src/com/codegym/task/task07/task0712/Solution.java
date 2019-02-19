package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String s = scanner.nextLine();
            list.add(i, s);
        }
            int min = 0;
            int max = 0;
            int min1 = list.get(0).length();
            int max1 = list.get(0).length();
            for (int a = 0; a < list.size(); a++) {
                if (min1 > list.get(a).length()) {
                    min1 = list.get(a).length();
                    min = a;

                }
                if (max1 < list.get(a).length()) {
                    max1 = list.get(a).length();
                    max = a;
                }
            }
            if (min < max) {
                System.out.println(list.get(min));
            } else {
                System.out.println(list.get(max));
            }
    }
}
