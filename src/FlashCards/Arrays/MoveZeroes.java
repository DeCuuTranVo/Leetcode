package FlashCards.Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        int writePointer = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
            else {
                countZero++;
            }
        }

        int backPointer = nums.length - 1;
        while (countZero > 0) {
            nums[backPointer] = 0;
            backPointer--;
            countZero--;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();

        int[] nums1 = {0,1,0,3,12};
        solver.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
 

        int[] nums2 = {0};
        solver.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
