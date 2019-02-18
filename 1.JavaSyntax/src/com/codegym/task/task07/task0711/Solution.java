package com.codegym.task.task07.task0711;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
            String s;
        for (int a = 0; a < 13; a++) {
            s = list.get(4);
            list.remove(4);
            list.add(0, s);
        }

        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
