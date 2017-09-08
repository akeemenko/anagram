package test;


import main.Anagram;
import main.DifferentLengthException;
import main.InvalidWordException;
import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;


public class AnagramTest {

    @Test
    public void testAnagramSimpleExample() throws Exception {
        Assert.assertTrue(Anagram.isAnagram("elvis", "lives"));
    }

    @Test
    public void testAnagramLowerCase() throws Exception {
        Assert.assertTrue(Anagram.isAnagram("Elvis", "liveS"));
    }

    @Test
    public void testAnagramWithSpace() throws Exception {
        Assert.assertTrue(Anagram.isAnagram("el vis", "lives "));
    }

    @Test(expected = DifferentLengthException.class)
    public void testAnagramWithEmptyString() throws Exception {
        Anagram.isAnagram("elvis", "");
    }

    @Test
    public void testAnagramWithAnotherChar() throws Exception {
        Assert.assertFalse(Anagram.isAnagram("elWis", "lives"));
    }

    @Test(expected = InvalidWordException.class)
    public void testAnagramWithNull() throws Exception {
        Anagram.isAnagram("elvis", null);
    }


    @Test(expected = DifferentLengthException.class)
    public void testAnagramWithDifferentLength() throws Exception, DifferentLengthException {
        Anagram.isAnagram("elvis123", "elvis");
    }
}