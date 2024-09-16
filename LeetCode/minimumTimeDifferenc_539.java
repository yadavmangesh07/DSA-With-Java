package LeetCode;

import java.util.Arrays;
import java.util.List;

public class minimumTimeDifferenc_539 {

    public int findMinDifference(List<String> timePoints) {
        int min[] = new int[timePoints.size()];

        for (int i = 0; i < min.length; i++) {

            min[i] = 60 * (Integer.parseInt(timePoints.get(i).substring(0, 2)))
                    + Integer.parseInt(timePoints.get(i).substring(3, 5));
        }
        // System.out.println(Arrays.toString(hr));
        Arrays.sort(min);
        System.out.println(Arrays.toString(min));
        int minDiff = 1440;

        for (int i = 1; i < min.length; i++) {
            minDiff = Math.min(minDiff, min[i] - min[i - 1]);
        }

        minDiff = Math.min(minDiff, 1440 - (min[min.length - 1] - min[0]));

        return minDiff;

    }
}
