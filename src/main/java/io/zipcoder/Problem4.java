package io.zipcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {



    public Map<Character,Integer> createCharFrequencyMap(String input) {

        char[] charArray = input.toCharArray();
        List<Character> characterArrayList = new ArrayList<Character>();

        for(char character: charArray){
            characterArrayList.add(character);
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (Character character : characterArrayList) {
            Integer count = map.get(character);
            map.put(character, (count == null) ? 1 : count + 1);
        }
        return map;

    }

    public static void printMap(Map<Character, Integer> map){

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "
                    + entry.getValue());
        }

    }

    public boolean isAnagramicPalindromic(String input) {

        Map<Character, Integer> checkMe = new HashMap<Character, Integer>();
        checkMe = createCharFrequencyMap(input);
        Integer count = 0;
        for (Map.Entry<Character, Integer> entry : checkMe.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}

