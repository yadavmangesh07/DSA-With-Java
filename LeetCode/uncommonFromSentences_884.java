package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class uncommonFromSentences_884 {

    class Solution {
        public static void uncommonFromSentences(String s1, String s2) {
            HashMap<String, Integer> hm = new HashMap<>();
            String arr1[] = s1.split(" ");
            String arr2[] = s2.split(" ");

            for (String s : arr1) {
                hm.put(s, hm.getOrDefault(s, 0) + 1);
            }
            for (String s : arr2) {
                hm.put(s, hm.getOrDefault(s, 0) + 1);
            }

            ArrayList<String> ls = new ArrayList<>();

            for (String i : hm.keySet()) {
                if (hm.get(i) == 1) {
                    ls.add(i);

                }

            }
            System.out.println(ls.toArray(new String[0]));

        }

        public static void main(String[] args) {
            String s1 = "this apple is sweet";
            String s2 = "this apple is sour";
            uncommonFromSentences(s1, s2);
            ;

        }

    }
}
