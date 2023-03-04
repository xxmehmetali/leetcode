package string;

import java.util.*;
import java.util.stream.Collectors;

public class Q1859 {
    /**
     *
     * @param s
     * @return
     *
     * Example 1:
     *
     * Input: s = "is2 sentence4 This1 a3"
     * Output: "This is a sentence"
     * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
     * Example 2:
     *              2       1   4   3
     * Input: s = "Myself2 Me1 I4 and3"
     * Output: "Me Myself and I"
     * Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
     */
    public static String sortSentence(String s) {
        Map<Integer, String> sortingMap = new TreeMap<>();
        Arrays.stream(s.split("\\s"))
                .forEach(word -> {
                    sortingMap.put(Integer.valueOf(Character.toString(word.charAt(word.length() -1))), word.substring(0, word.length() -1));
                });
        return sortingMap.values()
                .stream()
                .collect(Collectors.joining(" "))
                .toString();
    }
}
