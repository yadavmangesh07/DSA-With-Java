package ArrayList;
import java.util.*;
//time complexity==>O(n^2)
public class mostWater {
    public static void pillarIndex(ArrayList<Integer> list){
        int maxWater=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int height=Math.min(list.get(i), list.get(j));
                int width=j-i;
                maxWater=Math.max(maxWater, width*height);
                
            }
            
        }
        
        System.out.println("Volume Of Water Trapped : "+maxWater+" ltrs");

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
      
        pillarIndex(list);
    }
    
}
