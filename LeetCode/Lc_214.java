package LeetCode;

public class Lc_214 {
    public static boolean isPlalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;

            }
            start++;
            end--;

        }
        return true;
    }

    public static String shortestPalindrome(String s) {
        if (s.length() == 0)
            return "";
        int end = 0;

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp = s.substring(0, i + 1);
            boolean flag = isPlalindrome(temp);
            if (flag) {
                end = i;

            }

        }
        StringBuilder t = new StringBuilder(s.substring(end + 1));
        t.reverse();

        return t.toString() + temp;

    }

    public static void main(String[] args) {

        String s = "";
        System.out.println(shortestPalindrome(s));
        ;

    }
}
