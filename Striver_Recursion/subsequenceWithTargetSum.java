package Striver_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subsequenceWithTargetSum {
    static int count=0;
    public static void helper(ArrayList<Integer> ls,int target){
        int sum=0;
        ArrayList<Integer> rs=new ArrayList<>();
        subsequence_With_TargetSum(0, sum, target, ls, rs);
        System.out.println("answer :"+count);
        

    }
    public static void subsequence_With_TargetSum(int start,int sum,int target,ArrayList<Integer> ls,ArrayList<Integer> rs){
        if(start==ls.size()){
            if(sum==target){
                System.out.println(rs);
               count++;
            }
            return;
        }
        rs.add(ls.get(start));
        sum+=ls.get(start);
        subsequence_With_TargetSum(start+1, sum, target, ls, rs);
        rs.remove(rs.size()-1);
        sum-=ls.get(start);
        subsequence_With_TargetSum(start+1, sum, target, ls, rs);

    }
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>(Arrays.asList(1,2,1,3,5,2));
        helper(ls, 4);
    }
    
}
