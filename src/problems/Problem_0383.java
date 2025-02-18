package problems;

import java.util.HashMap;
import java.util.List;

public class Problem_0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> wordStorage = new HashMap<Character, Integer>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            if (!wordStorage.containsKey(c)) {
                wordStorage.put(c, 1);
            }
            else{
                wordStorage.put(c, wordStorage.get(c)+1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (!wordStorage.containsKey(c) || wordStorage.get(c) == 0) {
                return false;
            }
            else{
                wordStorage.put(c, wordStorage.get(c)-1);
            }
        }

        return true;
    }
    public static void main(String[] args) throws Exception {
        Problem_0383 prob_0383 = new Problem_0383();

        String ransomNote1 = "a";
        String magazine1 = "b";
        Boolean return1 = prob_0383.canConstruct(ransomNote1, magazine1);
        System.out.println(return1);

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        Boolean return2 = prob_0383.canConstruct(ransomNote2, magazine2);
        System.out.println(return2);

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        Boolean return3 = prob_0383.canConstruct(ransomNote3, magazine3);
        System.out.println(return3);

    }   
}
