package problems;

import java.util.List;

public class Problem_1342 {

    public int numberOfSteps(int num) {
        int stepCount = 0;

        while (num != 0) {
            if (num %2 == 0) {
                num = num /2;
            }
            else {
                num = num - 1;
            }
            stepCount++;
        }

        return stepCount;
    }
    public static void main(String[] args) throws Exception {
        Problem_1342 prob_1342 = new Problem_1342();

        int num1 = 14;        
        int return1 = prob_1342.numberOfSteps(num1);
        System.out.println(return1);

        int num2 = 8;        
        int return2 = prob_1342.numberOfSteps(num2);
        System.out.println(return2);

        int num3 = 123;        
        int return3 = prob_1342.numberOfSteps(num3);
        System.out.println(return3);

    }   
}
