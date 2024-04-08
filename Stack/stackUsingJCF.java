package Stack;
import java.util.*;
//using JCF=>java collection frameWork,stacks are already defined in the framework with prdefined functions of the stack 
public class stackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> lls=new Stack<>();
        lls.push(0);
        lls.push(1);
        lls.push(2);
        lls.push(3);
        lls.push(4);
        System.out.println(lls.pop());
        // while(!lls.isEmpty()){
        //     System.out.println(lls.peek());
        //     lls.pop();
        // }
        
    }
    
}
