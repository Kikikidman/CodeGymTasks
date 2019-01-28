package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(name + " will receive " + num1 + " in " + num2 + " years.");
    }
}
