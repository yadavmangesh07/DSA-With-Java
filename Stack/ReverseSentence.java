package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            for(String r:s.split(" ")){
                st.push(r);
                

            }
            while (!st.isEmpty()) {
              System.out.print(st.pop()+" ");
                
            }
            System.out.println();
        }
        sc.close();
    }
    
}
