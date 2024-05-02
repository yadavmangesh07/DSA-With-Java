package HashMap;

import java.util.HashMap;

public class subarrayWithSumK {
    public static int helper(int arr[],int target){
        HashMap<Integer,Integer> hm=new HashMap<>();
        //hm will track sum and count 
        hm.put(0, 1);
        int sum=0;
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(hm.containsKey(sum-target)){
                ans+=hm.get(sum-target);
            }else{
                hm.put(sum, hm.getOrDefault(sum, 0)+1);
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int target=-10;
        System.out.println(helper(arr, target));

    }
    
}
