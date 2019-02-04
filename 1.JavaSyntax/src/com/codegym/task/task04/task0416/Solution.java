package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        double num = Double.parseDouble(s);
        double res = num;

        String[] a = {"green","green","green","yellow","red"};
        System.out.println(a[(int)res % 5]);
        }
    }
