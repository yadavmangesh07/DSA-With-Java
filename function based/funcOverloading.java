public class funcOverloading {
    public static int cal(int a,int b){
        int c=a+b;
        return c;
    }
    public static int cal(int a,int b,int d){
        int c=a+b+d;
        return c;
    }
    public static float cal(float a,float b,float d){
        float c=(a+b+d);
        return c;
    }
    public static void main(String[] args) {
        int a=12;
        int b=12;
        // int c=12;
        System.out.println(cal(a, b));

        
    }
    
}
