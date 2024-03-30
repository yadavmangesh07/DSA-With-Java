package Recursion;

public class fibonacci {
    public static int fibo(int a){
        if(a==0 || a==1){
            return a;
        }
        else{
            return fibo(a-1)+fibo(a-2);
        }
        
    }
    public static void main(String[] args) {
        int a=5;

        System.out.println(fibo(a));
    }
    
}
