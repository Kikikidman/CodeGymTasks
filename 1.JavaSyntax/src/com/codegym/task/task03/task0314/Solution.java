package com.codegym.task.task03.task0314;

/* 
Multiplication table

*/

public class Solution {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 10; k++){
                System.out.print((k + 1) * (i + 1) + " ");
            }
        System.out.println("");
    }
  }
}