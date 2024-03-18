import java.util.ArrayList;

public class palindrome {
    public static void palindromeNumber(int a){
        
        ArrayList <String> list2=new ArrayList<>();
        int x=a;
        while(a>0){
            int b=a%10;
            list2.add(String.valueOf(b));
            a=a/10;
        }
        // System.out.println(list2);
        String c="";
        for (String string : list2) {
            c+=string;
            
        }
        int b=Integer.parseInt(c);
        if(x==b){
            System.out.println("Yes ,the number is palindrome!!");
        }
        else{
            System.out.println("No ,the number is not palindrome!!");
        }
        
        // return true;
    }
    public static void main(String[] args) {
        int a=1221;
        palindromeNumber(a);
    }
    
}
