package Task_231;

class Solution {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}