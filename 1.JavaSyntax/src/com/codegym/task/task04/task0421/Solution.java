package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (!a.equals("") && !b.equals("")) {
            if (a.equals(b)) {
                System.out.println("The names are identical");
            } else if (a.length() == b.length()) {
                System.out.println("The names are the same length");
            }
        }
    }
}