import java.util.ArrayList;

public class sumOfDigits {
    public static Integer sum(int a){
        ArrayList <Integer> list=new ArrayList<>();
        while (a>0) {
            int v=a%10;
            list.add(v);
            a=a/10;
            
        }
        int sum=0;
        for (Integer integer : list) {
            sum+=integer;

            
        }
        return sum;
    }
    public static void main(String[] args) {
        int a =123456789;
        System.out.println(sum(a));
    }
    
}
