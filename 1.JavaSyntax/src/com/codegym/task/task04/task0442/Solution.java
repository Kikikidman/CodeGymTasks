package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            int num = scanner.nextInt();
            sum += num;
            if (num == -1){
                System.out.print(sum);
                break;
            }
        }
    }
}
