package LeetCode;

import java.util.HashMap;

public class Lc_1346 {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int a=2*arr[i];
            System.out.println(arr[i]);
            if(a!=0){
                if(hm.containsKey(a)){
                    count++;
                }

            }
            else{
                if(hm.get(a)>1){
                    count++;
                }
            }
        }
        return count>=1?true:false;
        
    }
    public static void main(String[] args) {
        int arr[]={10,2,5,3};
        System.out.println(checkIfExist(arr));

    }
    
}
