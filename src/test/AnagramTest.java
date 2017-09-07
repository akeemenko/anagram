package test;


import main.Anagram;
import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;



public class AnagramTest {

    private Anagram anagram;

    // tests with real anagrams
    private String s1 = "elvis";
    private String s2 = "lives";

    private String s3 = "Elvis";
    private String s4 = "liveS";

    private String s5 = "el vis";
    private String s6 = "lives ";


    // tests with fake anagrams
    private String s7 = "elvis";
    private String s8 = "";

    private String s9 = "elwis";
    private String s10 = "lives";


    // tests with exceptions
    private String s11 = "elvis";
    private String s12 = null;

    private String s13 = "elvis123";
    private String s14 = "elvis";



    @Test
    public void testAnagramSimple() throws Exception {
       boolean result = anagram.isAnagram(s1, s2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testAnagramLowerCase() throws Exception {
        boolean result = anagram.isAnagram(s3, s4);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testAnagramWithSpace() throws Exception {
        boolean result = anagram.isAnagram(s5, s6);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testAnagramWithEmptyString() throws Exception {
        boolean result = anagram.isAnagram(s7, s8);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testAnagramWithAnotherChar() throws Exception {
        boolean result = anagram.isAnagram(s9, s10);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testAnagramWithNull() throws Exception {
        boolean result = anagram.isAnagram(s11, s12);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testAnagramWithDifferentLength() throws Exception {
        boolean result = anagram.isAnagram(s13, s14);
        Assert.assertEquals(false, result);
    }

}