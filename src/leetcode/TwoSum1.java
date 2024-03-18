package leetcode;

import java.util.ArrayList;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};

        System.out.println(twoSum(a, 9));

    }
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> returnList = new ArrayList<>();
        ArrayList<Integer> forReturn = new ArrayList<>();
        aa:
        for (int i : nums) {
            bb:
            for (int j : nums) {
                if (i + j == target) {
                    returnList.add(i);
                    returnList.add(j);
                    forReturn.add(returnList.indexOf(i));
                    forReturn.add(returnList.indexOf(j));
                    break aa;
                }
            }
        }
        return forReturn;
    }
}
