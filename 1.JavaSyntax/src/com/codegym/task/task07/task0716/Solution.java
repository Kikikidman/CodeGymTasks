package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        String remove = "r";
        String dupl = "l";

        for (int i = 0; i < list.size(); i++){
            if(list.get(i).contains(remove)){
                list.remove(list.get(i));
                i++;
            } if(list.get(i).contains(dupl)){
                list.set(1, list.get(i));
            } if (list.get(i).contains(remove) && list.get(i).contains(dupl)){
                list.set(i, list.get(i));
            }
        }

        return list;
}
}