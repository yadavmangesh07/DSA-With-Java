package Strings;

public class shuffleString {
    public static void shuffle(String s,int [] indices){
        char [] n= new char[indices.length];
        StringBuilder sb =new StringBuilder("");
        for (int i = 0; i < indices.length; i++) {
            n[indices[i]]=s.charAt(i);
        
        }
        for (char c : n) {
            sb.append(c);
            
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        int []indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        shuffle(s, indices);
        
    }
    
}
