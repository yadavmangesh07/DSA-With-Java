package GFG;

public class MaxStep {
    public int maxStepFunc(int arr[]) {
        int count = 0;
        int pcount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] >= 1) {
                pcount++;

            } else {
                pcount = 0;
            }
            if (pcount != 0) {
                count = Math.max(pcount, count);
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int l=2;
        int r=5;
        int a=l^r;
   String s=Integer.toBinaryString(a);
   for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='0'){
         System.out.println("true");
         break;
      }
      
   }
   
    }

}
