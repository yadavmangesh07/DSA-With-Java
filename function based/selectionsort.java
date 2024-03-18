import java.util.Arrays;

public class selectionsort {
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxindex = getmaxindex(arr, 0, last);
            int temp = arr[last];
            arr[last] = arr[maxindex];
            arr[maxindex] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    

    private static int getmaxindex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <=last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 56, -1, 99, 2, 7, 4, -3 };
        selection(arr);

    }
}
