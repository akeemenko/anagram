package main;

import java.util.Arrays;

public class Anagram {


    public static boolean isAnagram(String s1, String s2) throws DifferentLengthException, InvalidWordException {

        boolean b = true;

        if (s1 == null || s2 == null){
            throw new InvalidWordException(String.format("Invalid Word"));
        }

        String s1Clean = s1.replaceAll(" ", "");
        String s2Clean = s2.replaceAll(" ", "");

        if (s1Clean.length() != s2Clean.length()) {
            throw new DifferentLengthException(String.format("Strings %s and %s are different length", s1Clean, s2Clean));
        }
         else {
            char[] s1Array = s1Clean.toLowerCase().toCharArray();
            char[] s2Array = s2Clean.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            b = Arrays.equals(s1Array, s2Array);
        }
        return b;
    }
}