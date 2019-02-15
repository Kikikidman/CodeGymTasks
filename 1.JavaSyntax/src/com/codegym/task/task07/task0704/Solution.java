package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        for (int i = nums.length - 1; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }
}

