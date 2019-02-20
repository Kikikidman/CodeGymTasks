package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        int violate = 0;
        for (int a = 0; a < list.size(); a++) {

                if (list.get(a).length() < list.get(a + 1).length()) {
                    a++;
                }
                if (list.get(a).length() > list.get(a + 1).length()) {
                    violate = a + 1;

                    System.out.print(violate);
                    break;
                }
            }
        }
    }

