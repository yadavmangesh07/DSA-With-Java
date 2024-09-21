package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveAndNegative {
     static void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        for (Integer i : arr) {
            if (i >= 0) {
                p.add(i);
            } else {
                n.add(i);
            }

        }
        // System.out.println(p);

        int pi = 0;
        int ni = 0;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            temp = i;
            if (i % 2 == 0 && pi < p.size()) {
                arr.set(i, p.get(pi));
                pi++;
            } else if (i % 2 != 0 && ni < n.size()) {
                arr.set(i, n.get(ni));
                ni++;
            } else {
                break;
            }

        }

        while (ni < n.size()) {
            arr.set(temp++, n.get(ni++));

        }
        while (pi < p.size()) {
            arr.set(temp++, p.get(pi++));

        }

        System.out.println(arr);

    }

    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(35, -43, 29, 32, 29, -37, 46, 39, -3, -43, -19, 32, 43,
                27, 28, 11, 43, -21, -35, -25, -2, 36, -13, -6, 2, -45, -37, -4, -37, 35, -46, 5, -13, 10, 41, -34, -30,
                28, -47, -9, 26, 21, -44, 17, 16, -5, 39, 14, -35, 24, -9, 12, -15, 31, -32, 32, 47, 16, -30));
        rearrange(ls);

    }
    
}
