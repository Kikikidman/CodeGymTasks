package com.codegym.task.task04.task0404;

/* 
Cat register

*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        Cat cat = new Cat();
        cat.catCount = catCount + 1;
    }

    public static void main(String[] args) {

    }
}
