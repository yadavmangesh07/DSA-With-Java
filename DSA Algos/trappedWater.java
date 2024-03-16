// package DSA;

public class trappedWater {
    public static void water(int arr[]){
        int leftmax[]=new int[arr.length];
        leftmax[0]=arr[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i]=Math.max(leftmax[i-1], arr[i]);
            
        }
        int rightmax[]=new int[arr.length];
        rightmax[arr.length-1]=arr[arr.length-1];
        for (int j = arr.length-2; j >= 0; j--) {
            rightmax[j]=Math.max(arr[j], rightmax[j+1]);
            
        }
        // int waterlevel=0;
        int watertrapped=0;
        for (int j2 = 0; j2 < arr.length; j2++) {
            int waterlevel=Math.min(rightmax[j2], leftmax[j2]);
            watertrapped+=waterlevel-arr[j2];
            
        }
        System.out.println("water trapped :"+watertrapped);
    }
    public static void main(String[] args) {
        int arr1[]={4,2,0,6,3,2,5};
        water(arr1);
        
    }
    
}
