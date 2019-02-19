package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner((System.in));
        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            int add = scanner.nextInt();
            main.add(add);
        }
        for (int i = 0; i < main.size(); i++) {

            if (main.get(i) % 3 == 0) {
                div3.add(main.get(i));
            }
                if (main.get(i) % 2 == 0) {
                    div2.add(main.get(i));
                }
                    if(!(main.get(i) % 3 == 0) && !(main.get(i) % 2 == 0)){
                        other.add(main.get(i));
                    }
        }
            printList(div3);
            printList(div2);
            printList(other);
        }

        public static void printList(List<Integer> list) {

        for (int a : list){
            System.out.println(a);
        }
    }
}
