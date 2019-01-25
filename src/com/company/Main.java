package com.company;

public class Main {

            public static int convertToSecond(int hour){
            int a = hour * 3600;
            return a;
        }

        public static void main(String[] args) {
            System.out.println(convertToSecond(9));
            System.out.println(convertToSecond(14));
        }

    }

