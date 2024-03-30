package Recursion;
//here the time complexity of the code is O(log(n));
public class optimizedPower {
    public static int power(int b,int p){
        if(p==1){
            return b;
        }
        if(p%2==0){
            return power(b, p/2)*power(b, p/2);
        }  
        else{
            return power(b, 1)*power(b, p/2)*power(b, p/2);

        } 
        // return 

        }
        public static void main(String[] args) {
            int power=10;
            int base=2;
            System.out.println(power(base, power));
        }
        
    
}
