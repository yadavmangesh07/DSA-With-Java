package HashMap;

import java.util.HashMap;

public class largestSubarrayWithZeroSum {
    public static int helper(int arr[]){
        int sum=0;
        int reqLength=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, -1);//to deal with the case when at any point sum becomes zero 
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
            else{
                reqLength=Math.max(i-hm.get(sum), reqLength);
            }
            
        }
        return reqLength;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};
        System.out.println(helper(arr));
    }
    
}
