package Queue;
class Solution {
    public static void removeKdigits(String num, int k) {
        // if(k==num.length()){
        //     return "0";
            
        // }
        int arr[]=new int[k];
        int result[]=new int[num.length()-k];
        for (int i = 0; i < num.length(); i++) {
            if(i<k){
                arr[i]=num.charAt(i);
            }
            else{
                result[i-k]=num.charAt(i);
            }
            
        }
        
        
    }
    public static void main(String[] args) {
        String s="1432219";
        removeKdigits(s, 3);
        
    }
}