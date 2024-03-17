package ArrayList;

import java.util.ArrayList;

public class pairSumInRotatedSortedList {
    public static boolean pairSum3(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=0;
        int n=list.size();
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1)>list.get(i)){
                rp=i-1;
                lp=i;

            }
            
        }
        while(lp!=rp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }
            else if (list.get(rp)+list.get(lp)>target) {
                rp=(n+rp-1)%n;//formula 1 to make rp return to last index of list once it reaches zeorth index
                
            }
            else{
                lp=(lp+1)%n;//formula 2 to make lp return to zeroth index of list once it reaches last index
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> mylist=new ArrayList<>();
        mylist.add(11);
        mylist.add(15);
        mylist.add(6);
        mylist.add(8);
        mylist.add(9);
        mylist.add(10);
        System.out.println(pairSum3(mylist, 16));
    }
}
