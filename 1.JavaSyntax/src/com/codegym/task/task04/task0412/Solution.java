package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a1 = bufferedReader.readLine();

        int b = Integer.parseInt(a1);

        if (b > 0) {
            b = b * 2;
            System.out.println(b);
        }
        else if (b < 0) {
            b = b + 1;
            System.out.println(b);
        }
        else  {
            System.out.println(b);
        }
        }

    }

