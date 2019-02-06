package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    int left;
    int top;
    int width = 0;
    int height = 0;

    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
    }

    public Rectangle(int width){
        this.width = width;
    }

    public Rectangle(int top, int left, int height, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left, int height){
        this.left = left;
        this.top = top;
        this.height = height;
    }
    public static void main(String[] args) {

    }
}
