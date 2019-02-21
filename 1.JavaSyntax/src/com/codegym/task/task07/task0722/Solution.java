package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; ;i++){
            String str = reader.readLine();
            list.add(str);

            if(str.equals("end")){
                list.remove(list.get(i));

                for(String s : list){
                    System.out.println(s);
                }
                break;
            }
        }
    }
}



