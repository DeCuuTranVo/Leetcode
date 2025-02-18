package FlashCards.Arrays;

import java.util.Arrays;

public class SquareSortedArray {
    public int[] sortedSquares(int[] nums) {
        int positivePointer = 0;
        int negativePointer = 0;

        // find the pointer boundary
        int i = 0;
        while (i < nums.length && nums[i] < 0) {
            positivePointer++;
            i++;
        }

        negativePointer = positivePointer - 1;

        // System.out.println(positivePointer);
        // System.out.println(negativePointer);

        int[] results = new int[nums.length];
        int counter = 0;

        while (negativePointer >= 0 && positivePointer < nums.length) {
            int negativeSquare = nums[negativePointer] * nums[negativePointer];
            int positiveSquare = nums[positivePointer] * nums[positivePointer];

            // System.out.println(negativePointer + " : " + negativeSquare + " --- " + positivePointer + " : " + positiveSquare);

            if (negativeSquare < positiveSquare) {
                results[counter] = negativeSquare;
                negativePointer--;
            }
            else {
                results[counter] = positiveSquare;
                positivePointer++;
            }

            counter++;

            // System.out.println(Arrays.toString(results));
        }

        while (negativePointer >= 0) {
            int negativeSquare = nums[negativePointer] * nums[negativePointer];
            results[counter] = negativeSquare;
            negativePointer--;
            counter++;
        }

        while (positivePointer < nums.length) {
            int positiveSquare = nums[positivePointer] * nums[positivePointer];
            results[counter] = positiveSquare;
            positivePointer++;
            counter++;
        }

        return results;
    }

    public static void main(String[] args) {
        SquareSortedArray solver = new SquareSortedArray();

        int[] nums1 = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(nums1));
        int[] result1 = solver.sortedSquares(nums1);
        
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(nums2));
        int[] result2 = solver.sortedSquares(nums2);
        
        System.out.println(Arrays.toString(result2));

        int[] nums3 = {-2};
        System.out.println(Arrays.toString(nums3));
        int[] result3 = solver.sortedSquares(nums3);
        
        System.out.println(Arrays.toString(result3));

    }
}

