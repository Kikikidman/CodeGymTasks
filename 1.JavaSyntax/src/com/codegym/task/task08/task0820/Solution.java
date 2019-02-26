package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> resultCat = new HashSet<Cat>();

        for(int i = 0; i < 4; i++){
            resultCat.add(new Cat());
        }

        return resultCat;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> resultDog = new HashSet<Dog>();

        for(int i = 0; i < 3; i++){
            resultDog.add(new Dog());
        }
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> merge = new HashSet<>();
        merge.addAll(cats);
        merge.addAll(dogs);
        return merge;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Cat> iterator = cats.iterator();
        while(iterator.hasNext()){
            iterator.next();
            pets.removeAll(cats);

        }
    }

    public static void printPets(Set<Object> pets) {
        for(Object object  : pets){
            System.out.println(object);
        }
    }

    public static class Cat{

    }

    public static class Dog{

    }
}
