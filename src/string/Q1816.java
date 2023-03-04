package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q1816 {
    /**
     *
     * @param s
     * @param k
     * @return
     *
     * Input: s = "Hello how are you Contestant", k = 4
     * Output: "Hello how are you"
     * Explanation:
     * The words in s are ["Hello", "how" "are", "you", "Contestant"].
     * The first 4 words are ["Hello", "how", "are", "you"].
     * Hence, you should return "Hello how are you".
     */
    public static String truncateSentence(String string, int k) {

        String[] stringArray = string.split("\\s");
        String[] newStringArray = new String[k];
        for (int i=0; i < k; i++){
            newStringArray[i] = stringArray[i];
        }
        return Arrays.stream(newStringArray)
                .collect(Collectors.joining(" "))
                .toString();
    }

    public static String truncateSentence2(String string, int k) {

        return "";
    }
}
