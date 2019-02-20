package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        for(String a : result){
            System.out.println(a);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        for(int i = 0; i < list.size(); i++){
            list.add(i + 1, list.get(i));
            i++;
        }

        return list;
    }

}