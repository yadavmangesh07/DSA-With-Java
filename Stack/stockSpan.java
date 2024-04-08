package Stack;
import java.util.*;

public class stockSpan {
    
    public static void main(String[] args) {
        int stockArray[]={100,80,60,70,60,85,100};
        int spanArray[]=new int[stockArray.length];
        
        findSpanOfStack(stockArray,spanArray);
        for (Integer integer : spanArray) {
            System.out.println(integer);
            
        }
        
    }

    private static void findSpanOfStack(int []stockArray, int[] spanArray) {
        Stack<Integer> st=new Stack<>();
        spanArray[0]=1;//no less price than the first day
        st.push(0);
        for (int i = 1; i < stockArray.length; i++) {
            int currentprice=stockArray[i];
            while(!st.isEmpty() && currentprice>stockArray[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                spanArray[i]=i+1;//on the last day no stocks were found higher the currentprice(index+1(for the day itself))
            }
            else{
                int prevHighIndex=st.peek();
                spanArray[i]=i-prevHighIndex;

            }
            st.push(i);
            
            
        }
    }
    
}
