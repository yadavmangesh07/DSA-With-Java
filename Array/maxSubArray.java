//this the brute-force approach to solve this type of problems
//this the brute-force approach to solve this type of problems
//this the brute-force approach to solve this type of problems


public class maxSubArray {
    public static void max(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // Move this line outside the inner loop
                // currentsum = 0;
    
                System.out.print("[");
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print("" + arr[j2] + " ");
                    currentsum += arr[j2];
                }
                System.out.print("]");
                System.out.println(" Sum: " + currentsum);
    
                // Fix the condition here
                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
                // Move this line outside the inner loop
                currentsum = 0;
            }
            System.out.println();
        }
        System.out.println("max sum: " + maxsum);
    }
    
    public static void main(String[] args) {
        int array1[]={-1,-2,3};
        max(array1);
        
    }
    
}
