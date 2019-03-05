package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = date.parse(reader.readLine());
        SimpleDateFormat date2 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);


        System.out.println(date2.format(date1).toUpperCase());



    }
}
