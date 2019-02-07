package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Roman", 26, "nebomzh");
        Woman woman = new Woman("Ivan", 28, "bomzh");
        Man man2 = new Man("neRoman", 18, "tozheneBomzh");
        Woman woman2 = new Woman("neIvan", 18, "tozheBomzh");

        System.out.println(man.toString());
        System.out.println(man2.toString());
        System.out.println(woman.toString());
        System.out.println(woman2.toString());
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
           return this.name + " " + this.age + " " + this.address;
        }
        }


    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return this.name + " " + this.age + " " + this.address;
        }
    }
}

