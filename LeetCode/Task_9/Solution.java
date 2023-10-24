package Task_9;

public class Solution {
    public static boolean isPalindrome(int x) {
        return String.valueOf(x).contentEquals(new StringBuilder(String.valueOf(x)).reverse());
    }
}
