package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

import java.util.Collections;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";

        return String.join(result, Collections.nCopies(5, s));
    }

    public static String multiply(String s, int count) {
        String result = "";

        return String.join(result, Collections.nCopies(count, s));
    }

    public static void main(String[] args) {

    }
}
