/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {
    //  To Test Even Number Checker
    EvenCheck evenChecker = new EvenCheck();
    @Test
    public void checkWithInputNullForEvenNumberChecker(){
        Assertions.assertEquals(evenChecker.checkEvenNumber(null), null);
    }

    @Test
    public void checkWithInputEvenNumberForEvenNumberChecker(){
        Assertions.assertTrue(evenChecker.checkEvenNumber(10));
    }

    @Test
    public void checkWithInputOddNumberForEvenNumberChecker(){
        Assertions.assertFalse(evenChecker.checkEvenNumber(9));
    }

    //Test for leap year
    LeapYear leapYear=new LeapYear();
    @Test
    public void checkWithLeapYear(){
        Assertions.assertTrue(leapYear.checkYear(2000));
    }
    @Test
    public void checkWithNotLeapYear(){
        Assertions.assertFalse(leapYear.checkYear(1900));
    }

    //Test for finding Median of an unsorted array
    Median median=new Median();
    @Test
    public void checkWithUnsortedArrayForMedianFinder(){
        Float[] array = {6.7f, 4.5f, 7.8f, 3.2f, 8.9f};
        double output = 7.0f;
        Assertions.assertEquals(median.findMedian(array, array.length),output);
    }

    //Test for Palindrome String
    Palindrome palindrome=new Palindrome();
    @Test
    public void checkWithPalindromeInputForPalindrome(){
        Assertions.assertTrue(palindrome.checkPalindrome("madam"));

    }

    @Test
    public void checkWithNonPalindromeInputForPalindrome(){
        Assertions.assertFalse(palindrome.checkPalindrome(" Racecar"));
    }

    //Test for Taxi Fare
    @Test
    void checkForLessThenTwoKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less then 2 km
        Assertions.assertEquals(taxiFare.CalculateTaxiFare(1),50);
    }

    @Test
    void checkForLessThenFiveKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less than 5 km
        int distance = 3;
        double result = 60;
        Assertions.assertEquals(taxiFare.CalculateTaxiFare(distance),result);
    }

    @Test
    void checkForLessThenFifteenKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less than 15 km and greater than 5
        int distance = 10;
        double result = 180;
        Assertions.assertEquals(taxiFare.CalculateTaxiFare(distance),result);
    }

    @Test
    void checkForGreaterThenFifteenKm(){
        TaxiFare taxiFare = new TaxiFare();
        int distance = 16;
        double result = 240;
        Assertions.assertEquals(taxiFare.CalculateTaxiFare(distance),result);
    }
}
