package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_0412 {

    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                resultList.add("FizzBuzz");
            }
            else if (i % 5 == 0) {
                resultList.add("Buzz");
            }
            else if (i % 3 == 0) {
                resultList.add("Fizz");
            }
            else {
                resultList.add(String.valueOf(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) throws Exception {
        Problem_0412 prob_0412 = new Problem_0412();

        int num1 = 3;        
        List<String> returnList1 = prob_0412.fizzBuzz(num1);
        System.out.println(String.join(", ", returnList1));

        int num2 = 5;        
        List<String> returnList2 = prob_0412.fizzBuzz(num2);
        System.out.println(String.join(", ", returnList2));
        
        int num3 = 15;        
        List<String> returnList3 = prob_0412.fizzBuzz(num3);
        System.out.println(String.join(", ", returnList3));
        // System.out.println("Hello, World!");
    }   
}
