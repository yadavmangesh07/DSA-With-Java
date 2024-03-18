public class factorial {
    public static int fact(int a){
        int f=1;
        while (a>0) {
            f*=a;
            a--;
            
            
        }
        return f;
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println(fact(a));
        
    }
    
}
