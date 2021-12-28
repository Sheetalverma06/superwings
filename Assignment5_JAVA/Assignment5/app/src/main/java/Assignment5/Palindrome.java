package Assignment5;

public class Palindrome {
    public boolean checkPalindrome(String s)
    {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();
        // check whether the string is palindrome or not
        if (s.equals(reverse))
            return true;
        else
            return false;
    }
}
