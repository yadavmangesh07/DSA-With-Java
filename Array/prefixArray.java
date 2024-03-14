public class prefixArray {
    public static void sumOfSubArray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
            
        }
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                //since start i.e i=0 and and i-1 is gonna be = -1 therefore we have used ternary operator in the below line
                currentsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                
            }
            if (currentsum>maxsum){
                maxsum=currentsum;
            }
            
        }
        System.out.println("max sum :"+maxsum);
    }
    public static void main(String[] args) {
        int array1[]={-2,-1,3};
       sumOfSubArray(array1);
        
    }
    
}
