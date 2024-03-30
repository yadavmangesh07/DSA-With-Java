package Recursion;

public class decreasingNumber {
    public static void fnc(int a){
        if(a==1){
            System.out.print(a);
            return;
        }
        System.out.print(a+" ");
        fnc(a-1);
    }
    public static void main(String[] args) {
        int b=10;
        fnc(b);

        
    }
    
}
