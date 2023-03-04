package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q557 {

    /**
     * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     *
     * Example 1:
     *
     * Input: s = "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     * Example 2:
     *
     * Input: s = "God Ding"
     * Output: "doG gniD"
     */
    public static String reverseWords(String s) {
        return Arrays.stream(s.split("\\s"))
                .map(word -> {
                    StringBuilder stringBuilder = new StringBuilder(word);
                    return stringBuilder.reverse().toString();
                })
                .collect(Collectors.joining(" "))
                .toString();
    }
}
