import string.Q1768;
import string.inprogress.Q929;

public class Main {
    // https://blog.knoldus.com/java-streams-vs-loop/#:~:text=If%20you%20have%20a%20small,LinkedList%20it's%20a%20different%20matter).
    // incele
    public static void main(String[] args) {
        String[] mails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] mails2 = new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        //debugla burayı alttakini
        String[] mails3 = new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        String[] mails4 = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(Q929.numUniqueEmails2(mails4));
    }

}