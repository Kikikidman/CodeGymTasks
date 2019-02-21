package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human chelik = new Human("Ivan", true, 21);
        System.out.println(chelik.toString());
        Human chelik1 = new Human("Ivan", true, 21);
        System.out.println(chelik1.toString());
        Human chelik2 = new Human("Ivan", true, 21);
        System.out.println(chelik2.toString());
        Human chelik3 = new Human("Ivan", true, 21);
        System.out.println(chelik3.toString());
        Human chelik4 = new Human("Ivan", true, 21, chelik1, chelik2);
        System.out.println(chelik4.toString());
        Human chelik5 = new Human("Ivan", true, 21, chelik1, chelik2);
        System.out.println(chelik5.toString());
        Human chelik6 = new Human("Ivan", true, 21, chelik1, chelik2);
        System.out.println(chelik6.toString());
        Human chelik7 = new Human("Ivan", true, 21, chelik1, chelik2);
        System.out.println(chelik7.toString());
        Human chelik8 = new Human("Ivan", true, 21, chelik1, chelik2);
        System.out.println(chelik8.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null && this.mother != null)
                text += ", father: " + this.father.name + ", mother: " + this.mother.name;

            return text;
        }
    }
}