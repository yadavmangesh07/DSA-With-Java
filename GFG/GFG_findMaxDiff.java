package GFG;

import java.util.Stack;

// Given an integer array arr of integers, the task is to find the maximum absolute difference between the nearest left smaller element and the nearest right smaller element of every element in array arr. If for any component of the arr, the nearest smaller element doesn't exist then consider it as 0.


class GFG_findMaxDiff {
    public static int findMaxDiff(int[] arr) {
        // code here
        int leftSmaller[]=new int[arr.length];
        int rightSmaller[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            leftSmaller[i]=st.isEmpty()?0:st.peek();
            System.out.print(leftSmaller[i]+" ");
            st.push(arr[i]);
        }
        System.out.println();
        st.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            rightSmaller[i]=st.isEmpty()?0:st.peek();
            System.out.print(rightSmaller[i]+" ");
            st.push(arr[i]);
        }
        System.out.println();
        Integer max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,Math.abs(leftSmaller[i]-rightSmaller[i]));
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={37, 93, 65, 25 ,98 ,32, 98};
        System.out.println(findMaxDiff(arr));

    }
}
