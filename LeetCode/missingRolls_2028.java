package LeetCode;

import java.util.Arrays;

public class missingRolls_2028 {
     public static int[] missingRolls(int[] rolls, int mean, int n) {
        int res[]=new int[n];
        int pSum=0;
        for (int i : rolls) {
            pSum+=i;
            
        }
        System.out.println(pSum);
        int len=rolls.length+n;
        System.out.println(len);
        int reqSum=(mean*len)-pSum;
        if(reqSum<n || reqSum>(n*6)){
            System.out.println("[]");
            return new int[0];
        } 
            

        int a=reqSum/n;
        int b=reqSum%n;
        for (int i = 0; i < res.length; i++) {
            res[i]=a;
            
        }
        if(b!=0){
            int i=0;
            while(b!=0){
                b--;
                res[i]++;
                i++;
            }
        }
        
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        int rolls[]={4,5,6,2,3,6,5,4,6,4,5,1,6,3,1,4,5,5,3,2,3,5,3,2,1,5,4,3,5,1,5};
        int mean=4;
        int n=40;
        missingRolls(rolls, mean, n);
    }
    
}
