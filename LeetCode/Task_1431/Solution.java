package Task_1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int candy : candies) {
            if (max < candy) max = candy;
        }
        List<Boolean> flags = new ArrayList<>();
        for (int candy : candies) {
            flags.add(candy + extraCandies >= max);
        }
        return flags;
    }
}
