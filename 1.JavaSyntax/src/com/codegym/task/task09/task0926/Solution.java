package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] five = new int[] {1, 2, 3, 4, 5};
        int[] two = new int[] {1, 2};
        int[] four = new int[] {1, 2, 3, 4};
        int[] seven = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] zero = new int[0];
        list.add(five);
        list.add(two);
        list.add(four);
        list.add(seven);
        list.add(zero);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
