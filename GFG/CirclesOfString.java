package GFG;

import java.util.HashMap;

public class CirclesOfString {
    class Solution {
        public static int isCircle(String arr[]) {
            // code here
            HashMap<Character, Integer> hm = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {

                hm.put(arr[i].charAt(0), hm.getOrDefault(arr[i].charAt(0), 0) + 1);
                hm.put(arr[i].charAt(arr[i].length() - 1), hm.getOrDefault(arr[i].charAt(arr[i].length() - 1), 0) + 1);

            }
            for (char c : hm.keySet()) {
                if (hm.get(c) != 2)
                    return 0;

            }

            return 1;
        }
    }

    public static void main(String[] args) {
        String arr[] = { "for", "geek", "rig", "kaf" };
        System.out.println(Solution.isCircle(arr));

    }

}
