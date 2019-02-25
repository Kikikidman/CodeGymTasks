package com.codegym.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Method quartet

*/

public class Solution {
    public static List getListForGet() {
        ArrayList<Object> getList = new ArrayList<>();
        for(int i = 0; i < getList.size(); i++){
            getList.get(i);
        }
        return getList;
    }

    public static List getListForSet() {
        ArrayList<Object> setList = new ArrayList<>();
        for(int i = 0; i < setList.size(); i++){
            setList.set(i, i);
        }
        return setList;

    }

    public static List getListForAddOrInsert() {
        LinkedList<Object> addList = new LinkedList<>();
        for(int i = 0; i < addList.size(); i++){
            addList.add(i);
        }
        return addList;

    }

    public static List getListForRemove() {
        LinkedList<Object> removeList = new LinkedList<>();
        for(int i = 0; i < removeList.size(); i++){
            removeList.remove(i);
        }
        return removeList;

    }

    public static void main(String[] args) {

    }
}
