package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    int left;
    int top;
    int width = 0;
    int height = 0;

    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
    }

    public void initialize(int width){
        this.width = width;
    }

    public void initialize(int top, int left, int height, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left, int height){
        this.left = left;
        this.top = top;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
