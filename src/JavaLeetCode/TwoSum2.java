package JavaLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 13};
        int[] c = twoSum(arr, 9);
        for (int a : c) {
            System.out.println(a);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            int n=target-nums[i]; //getting the value we need by subtracting the target with the current value

            if(mp.containsKey(n)) //if the map already contains the "n" we are looking for
            {
                return new int[]{i,mp.get(n)};  //print there indexes
            }
            mp.put(nums[i],i); //putting the value and its index onto the map



        }
        return new int[0];
    }
}
