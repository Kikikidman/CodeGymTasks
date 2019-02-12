package com.codegym.task.task06.task0604;

/* 
Cat counter

*/

public class Cat {
    public static int catCount = 0;

    public Cat(){
        this.catCount = catCount + 1;
    }

    protected void finalize() throws Throwable {
        catCount = catCount - 1;
    }
    public static void main(String[] args) {

    }
}