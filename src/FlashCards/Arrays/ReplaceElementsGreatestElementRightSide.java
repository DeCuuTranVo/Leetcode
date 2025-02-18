package FlashCards.Arrays;

import java.util.Arrays;

public class ReplaceElementsGreatestElementRightSide {

    public int[] replaceElements(int[] arr) {
        int currentMax = 0;
        for (int i = arr.length -1 ; i >= 0; i--) {     
            if (i == arr.length-1) {
                currentMax = Math.max(arr[i], -1);
                arr[i] = -1;                
            }
            else {
                int tmp = arr[i];            
                arr[i] = currentMax; 
                currentMax = Math.max(tmp, currentMax);                           
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ReplaceElementsGreatestElementRightSide solver = new ReplaceElementsGreatestElementRightSide();

        int[] nums1 = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(nums1));
        int[] result1 = solver.replaceElements(nums1);
        
        System.out.println(Arrays.toString(result1));

        int[] nums2 = {400};
        System.out.println(Arrays.toString(nums2));
        int[] result2 = solver.replaceElements(nums2);
        
        System.out.println(Arrays.toString(result2));

    }
}
