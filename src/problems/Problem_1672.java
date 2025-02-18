package problems;

import java.util.Arrays;

public class Problem_1672 {
    public int maximumWealth(int[][] accounts) {
        int[] sumWealthIndividuals = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int sumWealthIndividual = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sumWealthIndividual+= accounts[i][j];
            }
            sumWealthIndividuals[i]=sumWealthIndividual;
        }

        int maxWealthIndividual = 0;
        for (int i = 0; i < sumWealthIndividuals.length; i++) {
            if (maxWealthIndividual < sumWealthIndividuals[i]) {
                maxWealthIndividual = sumWealthIndividuals[i];
            }
        }

        return maxWealthIndividual;
    }

    public static void main(String[] args) throws Exception {
        Problem_1672 prob_1672 = new Problem_1672();

        int[][] accounts1 = { 
            {1,2,3},
            {3,2,1}
        };        
        int result1 = prob_1672.maximumWealth(accounts1);
        System.out.println(result1);

        int[][] accounts2 = { 
            {1,5},
            {7,3},
            {3,5}
        };        
        int result2 = prob_1672.maximumWealth(accounts2);
        System.out.println(result2);

        int[][] accounts3 = { 
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };        
        int result3 = prob_1672.maximumWealth(accounts3);
        System.out.println(result3);
    }   
}
