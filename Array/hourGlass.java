import java.util.ArrayList;

public class hourGlass {

    public static int hourglassSum(int[][] arr) {
        int rowStart = 0;
        int rowEnd = 3;
        int colStart = 0;
        int colEnd = 3;
        int sum = 0;
        ArrayList<Integer> ls = new ArrayList<>();

        while (rowEnd <= 6) {
            while (colEnd <= 6) {
                sum = 0; // Reset sum for each hourglass

                for (int i = rowStart; i < rowEnd; i++) {
                    for (int j = colStart; j < colEnd; j++) {
                        // Skip the elements not part of the hourglass
                        if (i == rowStart + 1 && (j == colStart || j == colEnd - 1)) {
                            continue;
                        }
                        sum += arr[i][j];
                    }
                }
                ls.add(sum);
                colStart++;
                colEnd++;

            }
            rowStart++;
            rowEnd++;
            colStart = 0; // Reset column start for new row start
            colEnd = 3;   // Reset column end for new row start
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < ls.size(); i++) {
            maxSum = Math.max(maxSum, ls.get(i));
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {-9, -9, -9, 1, 1, 1},
            {0, -9, 0, 4, 3, 2},
            {-9, -9, -9, 1, 2, 3},
            {0, 0, 8, 6, 6, 0},
            {0, 0, 0, -2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };
        System.out.println(hourglassSum(arr)); // Output should be 28
    }
}

// import java.util.ArrayList;

// public class HourGlass {

//     public static int hourglassSum(int[][] arr) {
//         int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i <= 3; i++) {
        //     for (int j = 0; j <= 3; j++) {
        //         int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
        //                 + arr[i+1][j+1]
        //                 + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }

//         return maxSum;
//     }

//     public static void main(String[] args) {
//         int[][] arr = {
//             {-9, -9, -9,  1, 1, 1},
//             {0, -9,  0,  4, 3, 2},
//             {-9, -9, -9,  1, 2, 3},
//             {0,  0,  8,  6, 6, 0},
//             {0,  0,  0, -2, 0, 0},
//             {0,  0,  1,  2, 4, 0}
//         };
//         System.out.println(hourglassSum(arr));
//     }
// }

