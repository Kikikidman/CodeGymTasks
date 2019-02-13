package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner (System.in);
        double b = scanner.nextDouble();
        return b;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner (System.in);
        boolean c = scanner.nextBoolean();
        return c;
    }

    public static void main(String[] args) {

    }
}
