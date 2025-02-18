package problems;

import java.util.Arrays;

public class Problem_1480 {
    public int[] runningSum(int[] nums) {
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            nums[i] = curSum;
        }

        return nums;
    }

    public static void main(String[] args) throws Exception {
        Problem_1480 prob_1480 = new Problem_1480();

        int[] nums1 = { 1, 2, 3, 4 };        
        nums1 = prob_1480.runningSum(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,1,1,1,1};
        nums2 = prob_1480.runningSum(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {3,1,2,10,1};
        nums3 = prob_1480.runningSum(nums3);
        System.out.println(Arrays.toString(nums3));
        
        // System.out.println("Hello, World!");
    }   
}
