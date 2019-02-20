package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for(int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        int max = list[0];
        int min = list[0];
        for(int i = 0; i < list.length; i++){
            if(list[i] > max){
                max = list[i];
            } if(list[i] < min){
                min = list[i];
            }
        }
        System.out.print(max + " " + min);
    }
}
