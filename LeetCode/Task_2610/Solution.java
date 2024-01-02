package Task_2610;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<Set<Integer>> sets = new ArrayList<>();
        for (int num : nums) {
            boolean added = false;
            for (Set<Integer> set : sets) {
                if (!set.contains(num)) {
                    set.add(num);
                    added = true;
                    break;
                }
            }
            if (!added) {
                Set<Integer> newSet = new HashSet<>();
                newSet.add(num);
                sets.add(newSet);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Set<Integer> set : sets) {
            result.add(new ArrayList<>(set));
        }
        return result;
    }
}
