package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i = 0; i < a; i++){
            int b = scanner.nextInt();
            list.add(b);
        }

        return list;
    }
}
