package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num > 0){
            if(num % 2 == 0){
                even++;
            } else{
                odd++;
            }
            num = num / 10;
        } System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
}
