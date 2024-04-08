package Stack;

import java.util.Arrays;
import java.util.Stack;
//once the index is at the last element,search for next greater element begins from 0th index
public class nextGreaterCircularSearch {
    public static String nextGreaterElement(int nums[]){
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--){
            s.push(i);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!s.isEmpty() && nums[i]>=nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=nums[s.peek()];
            }
            s.push(i);
        }
        
    return Arrays.toString(nextGreater);
    
    }
    public static void main(String[] args) {
        int [] nums={6,8,0,1,3};
        System.out.println(nextGreaterElement(nums));
    }

    }


    
    

