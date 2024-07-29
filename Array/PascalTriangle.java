import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public static List<List<Integer>> generate(int t) {
        List<List<Integer>> ls= new ArrayList<>();
       
        for (int i = 1; i <=t; i++) {
            ArrayList<Integer> lsa=new ArrayList<>();
            lsa.add(1);
            
            
            if(i>2){
                List<Integer> prevList=ls.get(i-2);
                
                for (int j = 0; j < prevList.size()-1; j++) {

                    lsa.add(prevList.get(j)+prevList.get(j+1));

                }
                
                
            }
            if(i>1){
                lsa.add(1);
            }
            ls.add(lsa);
        }
        return ls;

        
    }
    public static void main(String[] args) {
        System.out.println(generate(4).toString());
    }

}