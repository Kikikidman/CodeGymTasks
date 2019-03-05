package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String replace = a.replaceAll("\\s","");
        char[] result = replace.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for(int i = 0; i < result.length; i++){
            if(isVowel(result[i])){
                vowel.add(result[i]);

            } else {
                consonants.add(result[i]);
            }
        }
        for(Character b : vowel){
            System.out.print(b + " ");
        }
        System.out.println();
        for(Character c : consonants){
            System.out.print(c + " ");
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}