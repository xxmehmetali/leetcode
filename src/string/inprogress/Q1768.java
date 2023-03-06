package string.inprogress;

/**
 *You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * Example 3:
 *
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 */
// STATUS : NOT COMPLETED
public class Q1768 {
    //word1:  a   b   c
    //word2:    p   q   r
    //merged: a p b q c r
    public static String mergeAlternately(String word1, String word2) {
        int max = Math.max(word1.length(), word2.length());
        String switchingWord = word1;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < max; i++){
            try {
                stringBuilder.append(switchingWord.charAt(i));
                switchingWord = word2;
            }catch (Exception e){
                //logging
                switchingWord = word1;
                stringBuilder.append(switchingWord.charAt(i));
            }
            stringBuilder.append(switchingWord.charAt(i));
        }
        return stringBuilder.toString();
    }
}











