package main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {

    public static void main(String[] args) throws IOException, DifferentLengthException, InvalidWordException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;

        System.out.println("Enter the first word: ");
        String s1 = consoleReader.readLine();
        System.out.println("Enter the second word: ");
        String s2 = consoleReader.readLine();
        b = Anagram.isAnagram(s1, s2);

        if (b) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }

    }
}
