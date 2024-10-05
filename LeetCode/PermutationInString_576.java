package LeetCode;

public class PermutationInString_576 {

    public boolean checkInclusion(String s1, String s2) {
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            s2Map[s2.charAt(i) - 'a']++;
            if (i >= s1.length()) {
                s2Map[s2.charAt(i - s1.length()) - 'a']--;
            }
            if (isSame(s1Map, s2Map)) {
                return true;
            }
        }
        return false;

    }

    private static boolean isSame(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        PermutationInString_576 obj = new PermutationInString_576();
        System.out.println(obj.checkInclusion(s1, s2));
    }

}
