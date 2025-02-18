package FlashCards.Arrays;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);

        int countDiff = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                countDiff++;
            }
        }

        return countDiff;
    }

    public static void main(String[] args) throws Exception {
        HeightChecker solver = new HeightChecker();

        int[] nums1 = {1,1,4,2,1,3};
        int result1 = solver.heightChecker(nums1);
        System.out.println(result1);

        int[] nums2 = {5,1,2,3,4};
        int result2 = solver.heightChecker(nums2);
        System.out.println(result2);

        int[] nums3 = {1,2,3,4,5};
        int result3 = solver.heightChecker(nums3);
        System.out.println(result3);
    }   
}
