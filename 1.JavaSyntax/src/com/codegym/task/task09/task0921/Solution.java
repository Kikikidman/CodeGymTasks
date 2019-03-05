package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; ; i++){
            try
            {
                int a = scanner.nextInt();
                list.add(a);
            }
            catch (InputMismatchException e){
                for(Integer a : list){
                    System.out.println(a);

                }break;
            }
        }
    }
}
