package Striver_Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static List<List<Integer>> combinationSumFunc(int[] candidates, int target) {
        List<List<Integer>> rs=new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), rs);
        System.out.println(rs);
        return new ArrayList<>();

        
    }
    public static void helper(int index,int [] arr,int target,List<Integer> ls,List<List<Integer>> rs){
        if(index==arr.length){
            if(target==0){

                rs.add(new ArrayList<>(ls));
            }
         
                return;
           
        }
        if(arr[index]<=target){
            ls.add(arr[index]);
            helper(index, arr, target-arr[index], ls, rs);

            ls.remove(ls.size()-1);
            
        }
        helper(index+1, arr, target, ls, rs);
        
    }

    public static void main(String[] args) {
       int [] candidate={2,3,6,7};
       int target=7;
       combinationSumFunc(candidate, target);

       

    }
    
}
