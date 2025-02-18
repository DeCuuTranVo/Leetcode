package FlashCards.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int curVal = Integer.MIN_VALUE;

        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != curVal) {
                curVal = nums[j];
                nums[i] = curVal;
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSortedArray solver = new RemoveDuplicatesSortedArray();

        int[] nums1 = {1,1,2};
        int result1 = solver.removeDuplicates(nums1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(result1);

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int result2 = solver.removeDuplicates(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(result2);
    }
}
