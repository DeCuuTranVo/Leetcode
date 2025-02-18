package FlashCards.Arrays;

import java.util.Arrays;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) throws Exception {
        SquaresSortedArray solver = new SquaresSortedArray();

        int[] nums1 = {-4,-1,0,3,10};
        int[] result1 = solver.sortedSquares(nums1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {-7,-3,2,3,11};
        int[] result2 = solver.sortedSquares(nums2);
        System.out.println(Arrays.toString(result2));
    }   
}
