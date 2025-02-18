package FlashCards.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();


        for (int i = 0; i < arr.length; i++) {
            if (temp.size() >= arr.length) {
                break;
            }

            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
            else{
                temp.add(arr[i]);
                temp.add(arr[i]);
            }

            // System.out.println("Loop " + i + ": " + Arrays.toString(arr) + " -> " + Arrays.toString(temp.toArray()));
        }

        // arr = temp;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp.get(i);
        }
        
        // System.out.println(Arrays.toString(arr));
        return;
    }
    
    public static void main(String[] args) throws Exception {
        DuplicateZeros solver = new DuplicateZeros();

        int[] nums1 = {1,0,2,3,0,4,5,0};
        solver.duplicateZeros(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1,2,3};
        solver.duplicateZeros(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {0,0,0,0,0,0,0};
        solver.duplicateZeros(nums3);
        System.out.println(Arrays.toString(nums3));
    }   
}
