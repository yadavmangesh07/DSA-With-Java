package Stack;

// import java.util.Arrays;
import java.util.Stack;

public class maxAreaHistogram {
    //function to calculate the next smaller bar on right===> lets say j
    public static int[] nextSmallerRight(int arr[]){
        Stack<Integer> st =new Stack<>();
        int [] nextSmallerR=new int[arr.length];
        for (int i = arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSmallerR[i]=arr.length;

            }
            else{
                nextSmallerR[i]=st.peek();//we will store the index only to find the widht later
            }
            st.push(i);
            
        }
        return nextSmallerR;
    }
    //function to calculate the next smaller bar on left===>lets say j
    public static int [] nextSmallerLeft(int arr[]){
        Stack<Integer> st=new Stack<>();
        int [] nextSmallerL=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {//imp concept ---->refer to the video lecture
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();

            }
            if(st.isEmpty()){
                nextSmallerL[i]=-1;
            }
            else{
               nextSmallerL[i]=st.peek();//we will store the index only to find the widht later
            }
            st.push(i);
            
        }
        return nextSmallerL;
    }
    // after calculating i and j ,we calculate the width of the rectangular bar to be formed i.e width=j-i-1 and height we will ge from the original array;
    public static int maxAreaCal(int arr[]){
        int arr1[]=nextSmallerRight(arr);
        int arr2[]=nextSmallerLeft(arr);
        // int maxArea[]=new int[arr.length];
        int maxArea=0;
        for (int i = 0; i < arr2.length; i++) {
            int width=(arr1[i]-arr2[i])-1;//j-i-1
            int height=arr[i];
            maxArea=Math.max(maxArea, height*width);

            
        }
        return maxArea;
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr1));

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        // System.out.println(maxAreaCal(arr));
        System.out.println(maxAreaCal(arr));
    }
}
