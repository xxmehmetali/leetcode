package string.inprogress;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q929 {
    /**
     * emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
     * emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
     */
    public static int numUniqueEmails2(String[] emails) {
        Set<String> uniqueEmails = Arrays.stream(emails)
                .map(email -> {
                    char localDivider = email.contains("+") ? '+' : '@';
                    String local = email.substring(0, email.indexOf(localDivider)).replaceAll("\\.", "");
                    String domain = email.substring(email.indexOf('@'), email.length());
                    return local + domain;
                })
                .collect(Collectors.toSet());
        return uniqueEmails.size();
    }
}












