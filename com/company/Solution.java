package com.company;
import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[]{map.get(t), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int target = 1;
        int[] newarr = twoSum(arr,target);
        System.out.println(Arrays.toString(newarr));
    }
}
