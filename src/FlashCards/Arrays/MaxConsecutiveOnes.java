package FlashCards.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

import problems.Problem_0383;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        ArrayList<Integer> numConsecutiveOnesArray = new ArrayList<Integer>();

        int oneCount = 0;
        boolean isZero = true;
        for (int i = 0; i < nums.length; i++ ) {
            // Check for zero and one
            if (nums[i] == 0) {
                isZero = true;
                if (oneCount > 0) {
                    numConsecutiveOnesArray.add(oneCount);
                    oneCount = 0;
                }                
            }
            else {
                isZero = false;
                oneCount++;
            }
            
            // Corner case: last item of an array
            if (i == nums.length-1) {
                isZero = true;
                if (oneCount > 0) {
                    numConsecutiveOnesArray.add(oneCount);
                    oneCount = 0;
                }        
            }

        }

        // System.out.println(Arrays.toString(numConsecutiveOnesArray.toArray()));

        int maxConsecutiveOnesNum = 0;
        for (int item : numConsecutiveOnesArray) {
            maxConsecutiveOnesNum = Math.max(maxConsecutiveOnesNum, item);
        }

        return maxConsecutiveOnesNum;
    }
    public static void main(String[] args) throws Exception {
        MaxConsecutiveOnes solver = new MaxConsecutiveOnes();

        int[] nums1 = {1,1,0,1,1,1};
        int result1 = solver.findMaxConsecutiveOnes(nums1);
        System.out.println(result1);

        int[] nums2 = {1,0,1,1,0,1};
        int result2 = solver.findMaxConsecutiveOnes(nums2);
        System.out.println(result2);

    }   
}
