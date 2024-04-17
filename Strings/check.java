package Strings;

public class check {
    public static void main(String[] args) {
        String a="()";
        System.out.println(func(a));
        
    }
    public static boolean func(String check){

      
        for (int i = 0,j=check.length()-1; i < check.length() && j>=0; i++,j--) {
             int rt=(int)check.charAt(i);
             int lt=(int)check.charAt(j);
             if((rt+1!=lt) || rt+2!=lt){
                return false;
             }
             
         
         
         
        }
        return true;
    }

    }
    

