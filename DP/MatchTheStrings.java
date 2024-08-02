package DP;

import java.util.Arrays;
// Given two strings str1 and str2. Return the minimum number of operations required to convert str1 to str2.
// The possible operations are permitted:

// Insert a character at any position of the string.
// Remove any character from the string.
// Replace any character from the string with any other character.

public class MatchTheStrings {
    public static int editDistance(String str1, String str2) {
        
        int i=str1.length();
        int j=str2.length();
        int dp[][]=new int[i+1][j+1];
       for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
       return helper(i-1,j-1,str1,str2,dp);
        
        
       
    }
    
    public static int helper(int i,int j,String str1, String str2,int dp[][]){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) {
            return dp[i][j];
         }
        if(str1.charAt(i)==str2.charAt(j)){
            
             return dp[i][j]=helper(i-1,j-1,str1,str2, dp);
             }
         return dp[i][j]=1+ Math.min(helper(i-1,j-1,str1,str2,dp) ,Math.min(helper(i,j-1,str1,str2,dp),helper(i-1,j,str1,str2,dp)));
        
        
        
        
        
        
    }
    public static void main(String[] args) {
        String str1="horse";
        String str2="ros";
        System.out.println(editDistance(str1, str2));
    }
    
}
