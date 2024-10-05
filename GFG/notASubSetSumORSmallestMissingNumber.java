package GFG;

public class notASubSetSumORSmallestMissingNumber {

    public long findSmallest(int[] arr) {
        int smallestMissing = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallestMissing) {
                return smallestMissing;
            }
            smallestMissing += arr[i];
        }

        return smallestMissing;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 10, 11, 15 };
        notASubSetSumORSmallestMissingNumber obj = new notASubSetSumORSmallestMissingNumber();
        System.out.println(obj.findSmallest(arr));
    }

}
