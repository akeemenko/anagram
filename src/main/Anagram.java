package main;

import java.util.Arrays;

public class Anagram {


    public static boolean isAnagram(String s1, String s2) throws DifferentLengthException, NullPointerException {

        boolean b = true;
        String s1Clean = s1.replaceAll(" ", "");
        String s2Clean = s2.replaceAll(" ", "");

        if (s1Clean.length() != s2Clean.length()) {
            b = false;
            throw new DifferentLengthException(String.format("Strings %s and %s are different length", s1Clean, s2Clean));
        }
         else {
            char[] s1Array = s1Clean.toLowerCase().toCharArray();
            char[] s2Array = s2Clean.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            b = Arrays.equals(s1Array, s2Array);
        }

        if (b) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
        return b;
    }
}