package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double size = 0;
        double mid = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {

                System.out.print(mid);
                break;
            }
            size += num;
            count++;
            mid = size / count;
        }
    }
}