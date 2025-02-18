package FlashCards.Arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer[] maxNums = new Integer[3]; // first max, second max, third max
        maxNums[0] = null;
        maxNums[1] = null;
        maxNums[2] = null;

        for (Integer num : nums) {
            if (maxNums[0] != null && maxNums[0].equals(num)) {
                continue;
            }

            if (maxNums[1] != null && maxNums[1].equals(num)) {
                continue;
            }

            if (maxNums[2] != null && maxNums[2].equals(num)) {
                continue;
            }

            if (maxNums[0] == null || maxNums[0] < num) {
                maxNums[2] = maxNums[1];
                maxNums[1] = maxNums[0];
                maxNums[0] = num;
            }
            else if (maxNums[1] == null || maxNums[1] < num) {
                maxNums[2] = maxNums[1];
                maxNums[1] = num;
            }
            else if (maxNums[2] == null || maxNums[2] < num) {
                maxNums[2] = num;
            }
            else {
                ;
            }
        }

        if (maxNums[2] != null) {
            return maxNums[2];
        }
        else{
            return maxNums[0];
        }
    }

    public static void main(String[] args) throws Exception {
        ThirdMaximumNumber solver = new ThirdMaximumNumber();

        int[] nums1 = {3,2,1};
        int result1 = solver.thirdMax(nums1);
        System.out.println(result1);

        int[] nums2 = {1,2};
        int result2 = solver.thirdMax(nums2);
        System.out.println(result2);

        int[] nums3 = {2,2,3,1};
        int result3 = solver.thirdMax(nums3);
        System.out.println(result3);
    }   
}
