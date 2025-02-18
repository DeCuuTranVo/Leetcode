package FlashCards.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // first pass
        for (int i = 0; i < nums.length; i++) {
            int targetIndex = Math.abs(nums[i]) - 1;
            nums[targetIndex] = - Math.abs(nums[targetIndex]);
        }

        // second pass
        List<Integer> results = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedArray solver = new FindAllNumbersDisappearedArray();

        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(nums1));
        List<Integer> result1 = solver.findDisappearedNumbers(nums1);    
        System.out.println(Arrays.toString(result1.toArray()));

        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(nums2));
        List<Integer> result2 = solver.findDisappearedNumbers(nums2);     
        System.out.println(Arrays.toString(result2.toArray()));

    }
}
