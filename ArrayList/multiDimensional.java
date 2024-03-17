package ArrayList;
import java.util.*;

public class multiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        
        ArrayList<Integer> list3=new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        for (int i = 1; i < 5; i++) {
            list1.add(2*i);
            list2.add(3*i);
            list3.add(4*i);
            
        }
        
            
        
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> currentList=list.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j)+" ");
                
            }
            System.out.println();
            
        }

    }
    
}
