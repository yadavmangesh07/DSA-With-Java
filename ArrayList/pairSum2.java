package ArrayList;

import java.util.ArrayList;

//time complexity==>O(n^2)
//using 2 pointer approach when list is sorted
public class pairSum2 {
    public static boolean pair(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }
            if(list.get(rp)+list.get(lp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        System.out.println(pair(height, 5));
    }
    
}
