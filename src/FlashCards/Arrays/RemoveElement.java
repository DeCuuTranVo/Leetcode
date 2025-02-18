package FlashCards.Arrays;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length ; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();

        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        int result1 = solver.removeElement(nums1, val1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(result1);

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int result2 = solver.removeElement(nums2, val2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(result2);
    }
}
