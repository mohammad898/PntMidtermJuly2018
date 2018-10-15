package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(true,Palindrome.isPalindrome("DAD"));
       String s="Java is the most  popular language in the world";
        Assert.assertEquals("java",DetermineLargestWord.largest_Word(s));
        Assert.assertEquals(false,Anagram.isAnagram("cat","act"));
    }
}
