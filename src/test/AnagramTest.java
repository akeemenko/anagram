package test;


import main.Anagram;
import main.DifferentLengthException;
import main.InvalidWordException;
import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;



public class AnagramTest {

    private Anagram anagram;


    @Test
    public void testAnagramSimpleExample() throws Exception {
       boolean result = anagram.isAnagram("elvis", "lives");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testAnagramLowerCase() throws Exception {
        boolean result = anagram.isAnagram("Elvis", "liveS");
        Assert.assertEquals(true, result);
    }

    @Test
    public void testAnagramWithSpace() throws Exception {
        boolean result = anagram.isAnagram("el vis", "lives ");
        Assert.assertEquals(true, result);
    }

    @Test(expected = DifferentLengthException.class)
    public void testAnagramWithEmptyString() throws Exception {
        boolean result = anagram.isAnagram("elvis", "");
    }

    @Test
    public void testAnagramWithAnotherChar() throws Exception {
        boolean result = anagram.isAnagram("elWis", "lives");
        Assert.assertEquals(false, result);
    }

    @Test(expected = InvalidWordException.class)
    public void testAnagramWithNull() throws Exception {
        boolean result = anagram.isAnagram("elvis", null);
    }


    @Test(expected = DifferentLengthException.class)
    public void testAnagramWithDifferentLength() throws Exception, DifferentLengthException {
        boolean result = anagram.isAnagram("elvis123", "elvis");
    }
}