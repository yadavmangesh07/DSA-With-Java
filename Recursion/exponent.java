package Recursion;

public class exponent {
    public static int powerCalculate(int base,int power){
        if(power==0){
            return 1;
        }

        return base*powerCalculate(base, power-1);
    }
    public static void main(String[] args) {
        int b=2;
        int pow=10;
        System.out.println(powerCalculate(b, pow));
        
    }
    
}
