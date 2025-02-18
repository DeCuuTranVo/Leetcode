package FlashCards.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> mem = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];

            if (mem.contains(cur * 2)) {
                return true;
            }

            if (cur % 2 == 0 && mem.contains(cur/2)) {
                return true;
            }

            if (!mem.contains(cur)) {
                mem.add(cur);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist solver = new CheckIfNAndItsDoubleExist();

        int[] nums1 = {10,2,5,3};
        boolean result1 = solver.checkIfExist(nums1);
        System.out.println(Arrays.toString(nums1));
        System.out.println(result1);

        int[] nums2 = {3,1,7,11};
        boolean result2 = solver.checkIfExist(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(result2);
    }
}
