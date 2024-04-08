package Stack;
import java.util.Arrays;
import java.util.Stack;

public class nextGreater {
    public static String nextGreaterElement(int arr[]){
        int nextGreater[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        
        for (int i = nextGreater.length-1; i >=0; i--) {
            //initially the stack is empty


            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;//if no greater element on the right is found.
            }
            else{
                nextGreater[i]=arr[s.peek()];

            }
            s.push(i);//in first iteration the last index of the arr will be pushed into the stack


            
        }
        return Arrays.toString(nextGreater);

        
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        
        System.out.println(nextGreaterElement(arr));

    }
    
}
