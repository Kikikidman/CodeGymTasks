package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    String name;
    int age = 12;
    String color = "red";
    int weight = 4;
    String address;

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;

    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
