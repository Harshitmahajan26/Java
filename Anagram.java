import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() == s2.length()) {
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1, str2) == true) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }

    }
}
