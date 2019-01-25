package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!!!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        zerg1.name = "Ivanchik";
        zerg2.name = "Ivanos";
        zerg3.name = "Ivanidze";
        zerg4.name = "Ivanchachos";
        zerg5.name = "Ivan";
        protoss1.name = "Vanyashka";
        protoss2.name = "Vanyanya";
        protoss3.name = "Vanya";
        terran1.name = "Ivankashka";
        terran2.name = "Ivankabuka";
        terran3.name = "Ivankasuke";
        terran4.name = "Ivanka-chan";

            }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
