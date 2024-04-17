package Strings;

public class stringCompression {
    public static void compress(String a) {
        StringBuilder sb = new StringBuilder("");
        int n = a.length();
        int i = 1;

        while (i < n) {
            char c = a.charAt(i - 1);
            int count = 1;

            while (i < n && c == a.charAt(i)) {
                count++;
                i++;
            }

            if (count > 1) {
                sb.append(c);
                sb.append(Integer.toString(count));
            } else {
                sb.append(a.charAt(i - 1));
            }

            i++;
        }

        // Handle the last character
        if (i == n) {
            sb.append(a.charAt(i - 1));
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String a = "aaabbbbccddd";
        compress(a);
    }
}
