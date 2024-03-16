public class stock2 {
    public static int maximum(int[] arr) {
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            if(bp<arr[i]){
                int profit=arr[i]-bp;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                bp=arr[i];
            }

        }
        return maxprofit;
        
    }
    public static void main(String[] args) {
        int stockPrize[]={7,6,4,3,1};
        System.out.println(maximum(stockPrize));

    }
    
}
