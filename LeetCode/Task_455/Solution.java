package Task_455;

import java.util.Arrays;

class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length, m = s.length;
        int i = 0, j = 0, count = 0;

        while (i < n && j < m) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}
