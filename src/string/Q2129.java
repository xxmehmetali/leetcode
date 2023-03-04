package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q2129 {
    /**
     *
     * @param title
     * Input: title = "capiTalIze tHe titLe"
     * Output: "Capitalize The Title"
     * Explanation:
     * Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
     */
    public static String capitalizeTitle(String title) {
        String lower = title.toLowerCase();
        String titleCase = Arrays.stream(lower.split("\\s"))
                .map(word -> {
                    StringBuilder stringBuilder = new StringBuilder(word);
                    if (word.length() > 2){
                        stringBuilder.setCharAt(0, Character.toString(stringBuilder.charAt(0)).toUpperCase().charAt(0));
                    }
                    return stringBuilder.toString();
                }).collect(Collectors.joining(" "));
        return titleCase;
    }
}
