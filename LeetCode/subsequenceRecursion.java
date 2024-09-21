package LeetCode;

import java.util.ArrayList;

public class subsequenceRecursion {
    public static ArrayList<ArrayList<Integer>> subsequence(ArrayList<Integer> ls){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> res2=new ArrayList<>();
        helper(res, ls, 0, res2);
        

        return res;
    }
    public static void helper(ArrayList<ArrayList<Integer>> rs,ArrayList<Integer> ls,int s,ArrayList<Integer> ss){
        if(s==ls.size()){
             rs.add(new ArrayList<>(ss));
             return;
            
        }
        ss.add(ls.get(s));
        helper(rs, ls, s+1, ss);
        ss.remove(ls.get(s));
        helper(rs, ls, s+1, ss);


    }
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(1);
        ls.add(3);
        ls.add(2);
        
        System.out.println(subsequence(ls));
    
        
        
    }
    
}
