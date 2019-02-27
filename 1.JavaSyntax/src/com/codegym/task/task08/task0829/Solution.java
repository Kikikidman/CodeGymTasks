package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of city and families
        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String cities = reader.readLine();
            if (cities.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.put(cities, family);
        }

        // Read the city
        String a = reader.readLine();
        if(addresses.containsKey(a))
        System.out.println(addresses.get(a));
    }
}
