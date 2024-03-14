class Solution {
    public int maxSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                max=Math.max(max, nums[i]+nums[j]);
                
            }
            
        }
        while(max>0){
            String s=Integer.toString(max);
            int temp=s.length()-1;
            max=max/temp;

        }
        return -1;
    }
    public static void main(String[] args) {
        int max=8888;
        
            String s=Integer.toString(max);
            System.out.println(s);
            int temp=s.length();
            System.out.println(temp);
            double pow=Math.pow(10, temp-1);
            System.out.println((int)pow);

            max=max/(int) pow;

        
        System.out.println(max);
    }
}