package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int a = (x2 - x1) * (x2 - x1);
        int b = (y2 - y1) * (y2 - y1);
        int c = a + b;
        return Math.sqrt(c);
    }

    public static void main(String[] args) {

    }
}
