package Task_300;


import static Task_300.Solution.lengthOfLIS;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        System.out.println(lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
