package org.example.tasks;

import java.util.Arrays;

public class First {
    public static int maxPairwiseProduct(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2];
    }
}
