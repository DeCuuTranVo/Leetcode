package FlashCards.Arrays;

public class NumbersEvenNumberDigits {
    public boolean hasEvenNumberDigits(int num) {
        String numString = String.valueOf(num);
        if (numString.length() %2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }


    public int findNumbers(int[] nums) {
        int countNumHasEvenNumnberDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean thisNumHasEvenNumberDigits = hasEvenNumberDigits(nums[i]);
            if (thisNumHasEvenNumberDigits) {
                countNumHasEvenNumnberDigits++;
            }
        }

        return countNumHasEvenNumnberDigits;
    }

    public static void main(String[] args) throws Exception {
        NumbersEvenNumberDigits solver = new NumbersEvenNumberDigits();

        int[] nums1 = {12,345,2,6,7896};
        int result1 = solver.findNumbers(nums1);
        System.out.println(result1);

        int[] nums2 = {555,901,482,1771};
        int result2 = solver.findNumbers(nums2);
        System.out.println(result2);

    }   
}
