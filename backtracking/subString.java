package backtracking;

public class subString {
    public static void subStringFunc(String s,int i,String ans ){
        if(i==s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            
            }
            return;
        }
        //yes participation choice
        subStringFunc(s, i+1, ans+s.charAt(i));
        //no participation choice
        subStringFunc(s, i+1, ans);
    }
    public static void main(String[] args) {
        String q="abc";
        
        subStringFunc(q, 0, "");
    }
}
