public class kadanesAlgo {
    public static void kadanes(int arr[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];
            
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
            
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        
        System.out.println("max sum: " + maxsum);
    }

    public static void main(String[] args) {
        int array[] = {-1, -2, -3, -4};
        kadanes(array);
    }
}