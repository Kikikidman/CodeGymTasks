package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = "";
        s2 = s2 + s.substring(0, 1).toUpperCase();
        for (int i = 1; i < s.length(); i++) {

            if (" ".equals(s.substring(i-1, i)))
                s2 = s2 + s.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + s.substring(i, i+1);
        }

        System.out.println(s2);
    }
}
