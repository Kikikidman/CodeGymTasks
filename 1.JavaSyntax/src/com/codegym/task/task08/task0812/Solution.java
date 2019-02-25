package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            int j = i + 1;

            if (list.get(i).equals(list.get(j))) {
                count += 1;
                if (max < count){
                    max = count;
                }
            } else {
                count = 1;
            }
        }
            System.out.println(max);
    }

}

