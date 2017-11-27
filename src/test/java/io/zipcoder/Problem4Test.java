package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem4Test {


    @Before
    public void setup(){

    }

    @Test
    public void getMapOfLetterFrequencyTest(){
        Problem4 problem4 = new Problem4();

        String input = "aabbbcccc";
        Map<Character, Integer> expected = new HashMap<Character, Integer>();

        expected.put('a',2);
        expected.put('b',3);
        expected.put('c',4);

        Map<Character, Integer> actual = problem4.createCharFrequencyMap(input);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void printMapTest(){

        Problem4 problem4 = new Problem4();

        String input = "cdcdcdcdeeeef";
        Map<Character, Integer> expected = new HashMap<Character, Integer>();

        Map<Character, Integer> actual = problem4.createCharFrequencyMap(input);
        problem4.printMap(actual);

    }

    @Test
    public void isAnagramicPalindromicTest(){

        Problem4 problem4 = new Problem4();

        String input = "cdcdcdcdeeeef";
        boolean actual = problem4.isAnagramicPalindromic(input);

        String input2 = "aaaaaaaaaaa";
        boolean actual2 = problem4.isAnagramicPalindromic(input2);

        String input3 = "qwertyuiopasdf";
        boolean actual3 = problem4.isAnagramicPalindromic(input3);


        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
        Assert.assertFalse(actual3);

    }




}
