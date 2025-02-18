package FlashCards.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i+m] = nums2[i]; 
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        MergeSortedArray solver = new MergeSortedArray();

        int[] nums1_1 = {1,2,3,0,0,0};
        int m1 = 3;
        int[] nums1_2 = {2,5,6};
        int n1 = 3;
        solver.merge(nums1_1, m1, nums1_2, n1);
        System.out.println(Arrays.toString(nums1_1));

        int[] nums2_1 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        solver.merge(nums2_1, m2, nums2_2, n2);
        System.out.println(Arrays.toString(nums2_1));

        int[] nums3_1 = {0};
        int m3 = 0;
        int[] nums3_2 = {1};
        int n3 = 1;
        solver.merge(nums3_1, m3, nums3_2, n3);
        System.out.println(Arrays.toString(nums3_1));
    }
}
