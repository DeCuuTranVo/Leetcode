package FlashCards.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int cntPeak = 0;
        int cntValley = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1] == arr[i] || arr[i] == arr[i+1]) {
                return false;
            }

            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                cntPeak++;
            }

            if (arr[i-1] > arr[i] && arr[i] < arr[i+1]) {
                cntValley++;
            }
        }

        if (cntPeak != 1) {
            return false;
        }

        if (cntValley != 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidMountainArray solver = new ValidMountainArray();

        int[] nums1 = {2,1};
        boolean result1 = solver.validMountainArray(nums1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(result1);

        int[] nums2 = {3,5,5};
        boolean result2 = solver.validMountainArray(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(result2);

        int[] nums3 = {0,3,2,1};
        boolean result3 = solver.validMountainArray(nums3);
        System.out.println(Arrays.toString(nums3));
        System.out.println(result3);

        int[] nums4 = {0,1,2,3,4,5,6,7,8,9};
        boolean result4 = solver.validMountainArray(nums4);
        System.out.println(Arrays.toString(nums4));
        System.out.println(result4);

        int[] nums5 = {9,8,7,6,5,4,3,2,1,0};
        boolean result5 = solver.validMountainArray(nums5);
        System.out.println(Arrays.toString(nums5));
        System.out.println(result5);

        int[] nums6 = {0,1,2,1,2};
        boolean result6 = solver.validMountainArray(nums6);
        System.out.println(Arrays.toString(nums6));
        System.out.println(result6);
    }
}

