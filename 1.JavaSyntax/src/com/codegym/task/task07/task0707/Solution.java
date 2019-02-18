package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "bla");
        list.add(1, "blo");
        list.add(2, "ble");
        list.add(3, "blu");
        list.add(4, "bli");
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
