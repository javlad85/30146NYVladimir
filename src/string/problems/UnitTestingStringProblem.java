package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingStringProblem {

    @Test
    public void testPositiveAreAnagram() {
        boolean ExpectedResult = true;
        boolean ActualResult = Anagram.areAnagram("cat", "act");
        Assert.assertEquals(true, ActualResult);
    }


    @Test
    public void testNegativeIsPalindrome() {
        boolean ExpectedResult = true;
        boolean ActualResult = Palindrome.isPalindrome("bnh");
        Assert.assertNotEquals(true,ActualResult);
    }

    @Test
    public void testDuplicateWord() {

    }



}
