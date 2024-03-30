package Recursion;

public class sumOfNaturalNumbers {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println(sum(a));
    }
    
}
