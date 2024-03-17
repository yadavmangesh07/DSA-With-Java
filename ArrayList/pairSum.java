package ArrayList;
import java.util.*;
//time complexity==>O(n^2)

public class pairSum {
    public static boolean pairs(ArrayList<Integer> list,int target){
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j)==target){
                    return true;
                }

                
            }
            
            
        }
        return false;

    }public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(5);
        
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(1);
        height.add(6);
        System.out.println(pairs(height, 5));
    }

    
}
