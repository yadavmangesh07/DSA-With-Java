package backtracking;

public class permutation {
    public static void permutationFunc(String s,String ans){
        //base case
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        //time complexity -->O(n*n!)
        for (int i = 0; i < s.length(); i++) {
            char current=s.charAt(i);
            String q=s.substring(0, i)+s.substring(i+1);
            permutationFunc(q, ans+current);
            
        }
    }
    public static void main(String[] args) {
        String s="ram";
        permutationFunc(s, "");
    }
}
