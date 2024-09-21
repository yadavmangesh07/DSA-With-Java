package Striver_Recursion;
import java.util.*;

public class subsequenceWithTargetSumII {
    public static boolean printAnySubsequenceWithTargetSum(int arr[],int start,int target,int sum,boolean flag,ArrayList<Integer> ls){
        if(start==arr.length){
            if(sum==target && flag==false){
                System.out.println(ls);
                return true;
            }
            return false;

        }
        ls.add(arr[start]);
        sum+=arr[start];
        if(printAnySubsequenceWithTargetSum(arr, start+1, target, sum, flag, ls)){
            return true;
        }
        sum-=arr[start];
        ls.remove(ls.size()-1);
        if(printAnySubsequenceWithTargetSum(arr, start+1, target, sum, flag, ls)){
            return true;
        }
        return false;

    }



    public static void main(String[] args) {
        int arr[]={1,2,1};
        ArrayList<Integer> ls=new ArrayList<>();
        System.out.println(printAnySubsequenceWithTargetSum(arr, 0, 2, 0, false, ls));
    }
    
}
