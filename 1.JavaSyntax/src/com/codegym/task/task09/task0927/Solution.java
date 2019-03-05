package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Ivan", new Cat("Ivan"));
        cats.put("Ivanka", new Cat("Ivanka"));
        cats.put("Ivanidze", new Cat("Ivanidze"));
        cats.put("Ivanochka", new Cat("Ivanochka"));
        cats.put("Ivana", new Cat("Ivana"));
        cats.put("Ivano", new Cat("Ivano"));
        cats.put("Ivani", new Cat("Ivani"));
        cats.put("Ivanu", new Cat("Ivanu"));
        cats.put("Ivane", new Cat("Ivane"));
        cats.put("Ivanak", new Cat("Ivanak"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> setCats = new HashSet<Cat>(map.values());

        return setCats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
