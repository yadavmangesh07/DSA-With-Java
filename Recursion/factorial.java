package Recursion;

public class factorial {
    public static int fact(int i){
       
        if(i==0){
            return 1;
            
        
        }
        else{
            
            return i*fact(i-1); 
        }
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(fact(a));

    }
    
}
