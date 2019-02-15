package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName, 'f');

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName, 'm');

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, 'f');

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather, 'm');

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather, 'f');

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather, 'm');

        System.out.println(catGrandmother);
        System.out.println(catGrandfather);
        System.out.println(catMother);
        System.out.println(catFather);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        char type;
        private Cat Grandparent;
        private Cat parent;

        Cat(String name, char type) {
            this.name = name;
            this.type = type;
        }

        Cat(String name, Cat Grandparent, char type) {
            this.name = name;
            this.Grandparent = Grandparent;
            this.type = type;
        }

        public Cat(String name, Cat Grandparent, Cat parent, char type) {
            this.name = name;
            this.Grandparent = Grandparent;
            this.parent = parent;
            this.type = type;
        }

        @Override
        public String toString() {
            if (Grandparent == null && parent == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else if (parent == null) {
                if (type == 'm') {
                    return "The cat's name is " + name + ", " + Grandparent.name + " is the mother, no father";
                } else {
                    return "The cat's name is " + name + ", no mother, " + Grandparent.name + " is the father";
                }
            } else {
                return "The cat's name is " + name + ", " + parent.name + " is the mother, " + Grandparent.name + " is the father";
            }
        }
    }
}
