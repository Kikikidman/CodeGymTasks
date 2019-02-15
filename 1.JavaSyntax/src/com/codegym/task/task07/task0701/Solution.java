package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int max(int[] array) {
        int arr2 = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > arr2){
                arr2 = array[i];
            }
        }

        return arr2;
    }
}