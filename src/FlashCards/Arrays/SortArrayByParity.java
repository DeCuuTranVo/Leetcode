package FlashCards.Arrays;

import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0;
        int oddPointer = nums.length - 1;

        while (evenPointer < oddPointer)  {
            if (nums[evenPointer] % 2 == 1 && nums[oddPointer] % 2 == 0) {
                int tmp = nums[evenPointer];
                nums[evenPointer] = nums[oddPointer];
                nums[oddPointer] = tmp;
            }

            if (nums[evenPointer] % 2 == 0) {
                evenPointer++;
            }
            if(nums[oddPointer] % 2 == 1) {
                oddPointer--;
            }
        }
        
        return nums;
    }

    public static void main(String[] args) throws Exception {
        SortArrayByParity solver = new SortArrayByParity();

        int[] nums1 = {3,1,2,4};
        int[] result1 = solver.sortArrayByParity(nums1);
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {0};
        int[] result2 = solver.sortArrayByParity(nums2);
        System.out.println(Arrays.toString(result2));

    }   
}
