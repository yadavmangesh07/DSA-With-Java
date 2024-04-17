package Strings;

public class upperCaseString {
    public static StringBuilder upperCase(String a){
       StringBuilder sb=new StringBuilder("");
        char c=Character.toUpperCase(a.charAt(0));
        sb.append(c);
        for (int i = 1; i < a.length(); i++) {
            if(a.charAt(i)==' ' && i<a.length()-1){
                sb.append(a.charAt(i));
                sb.append(Character.toUpperCase(a.charAt(i+1)));
                i++;
                
               
               
 
            }
            else{
                sb.append(a.charAt(i));
            }
            
               
            }
            return sb;
            
        
        
    }
    public static void main(String[] args) {
        String a="i am mangesh yadav ";
        System.out.println(upperCase(a));
    }
}
    

