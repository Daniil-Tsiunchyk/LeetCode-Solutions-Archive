public class Problem_1347 {
    public static class Main {
        public static void main(String[] args) {
            String s1 = "bab", t1 = "aba";
            System.out.println(Solution.minSteps(s1, t1));

            String s2 = "leetcode", t2 = "practice";
            System.out.println(Solution.minSteps(s2, t2));

            String s3 = "anagram", t3 = "mangaar";
            System.out.println(Solution.minSteps(s3, t3));
        }
    }

    static class Solution {
        public static int minSteps(String s, String t) {
            int[] frequency = new int[26];

            for (int i = 0; i < s.length(); i++) {
                frequency[s.charAt(i) - 'a']++;
                frequency[t.charAt(i) - 'a']--;
            }

            int steps = 0;
            for (int freq : frequency) {
                if (freq > 0) {
                    steps += freq;
                }
            }

            return steps;
        }
    }
}
