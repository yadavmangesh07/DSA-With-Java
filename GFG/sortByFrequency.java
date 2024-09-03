package GFG;

import java.util.ArrayList;
import java.util.TreeMap;

public class sortByFrequency {
    public static ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            
        }
        
        System.out.println(hm);
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> freq=new ArrayList<>();
        for (Integer integer : hm.keySet()) {
            num.add(integer);
            freq.add(hm.get(integer));
            
        }
        System.out.println(num);
        System.out.println(freq);
        int k=num.size();
        while(k-->0){
            int maxFreq=0;
        int maxFreqIndex=-1;
        for (int i = 0; i < freq.size(); i++) {
            if(freq.get(i)>maxFreq){
                maxFreq=freq.get(i);
                maxFreqIndex=i;
            }

            
        }
        for (int i = 0; i < maxFreq; i++) {
            ls.add(num.get(maxFreqIndex));
            
        }
        num.remove(maxFreqIndex);
        freq.remove(maxFreqIndex);

        }

        



       
        return ls;
    }
    public static void main(String[] args) {
        int arr[]={5, 5, 4, 6,6,6, 4};
        System.out.println(sortByFreq(arr));;

    }
    
}
