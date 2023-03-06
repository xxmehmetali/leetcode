package string.inprogress;

// STATUS : TO BE CONTINUED
public class Q125 {
    // runtime around 750ms / not good
    public static boolean isPalindrome(String s) {
        String sAlpha = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sAlphaStrBuilder = sAlpha;
        StringBuilder stringBuilder = new StringBuilder(sAlphaStrBuilder).reverse();
        return stringBuilder.toString().equals(sAlpha);
    }

    // look for another solution to decrease run time
    public static boolean isPalindrome2(String s) {
        String sAlpha = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sAlphaStrBuilder = sAlpha;
        StringBuilder stringBuilder = new StringBuilder(sAlphaStrBuilder).reverse();
        return stringBuilder.toString().equals(sAlpha);
    }
}
