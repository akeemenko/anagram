package main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {

    public static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    public static Anagram anagram = new Anagram();

    public static void main(String[] args) throws IOException, DifferentLengthException {

        System.out.println("Enter the first word: ");
        String s1 = consoleReader.readLine();
        System.out.println("Enter the second word: ");
        String s2 = consoleReader.readLine();
        anagram.isAnagram(s1, s2);
    }
}
