package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int b = scanner.nextInt();

        int c = 0;
        while(c < b){
            System.out.println(a);
            c++;
        }

    }
}
