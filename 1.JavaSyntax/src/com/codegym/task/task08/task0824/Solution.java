package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> child = new ArrayList<>();
        ArrayList<Human> parents = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();


        Human children = new Human("Ivan", true, 28);
        Human children2 = new Human("Ivanka", true, 25);
        Human children3 = new Human("Ivanidze", true, 20);

        child.add(children);
        child.add(children2);
        child.add(children3);

        Human father = new Human("Batya", true, 35, child);
        Human mother = new Human("Mamka", false, 30, child);

        parents.add(father);
        parents2.add(mother);

        Human grandmother = new Human("Babushka", false, 60, parents);
        Human grandmother1 = new Human("Babushka1", false, 65, parents2);
        Human grandfather = new Human("Dedushka", true, 70, parents);
        Human grandfather1 = new Human("Dedushka1", true, 75, parents2);

        System.out.println(grandfather.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandmother1.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
