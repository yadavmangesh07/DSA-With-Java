package Stack;
import java.util.*;;

public class pushAtBottom {
    public static void pushAtBottomFunc(Stack<Integer> s,int data){
        //2)insert element at bottom when stack is empty
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //1)pop all the elements of the stack one by one and store them too
        int val=s.pop();//pop values from stack going down.
        pushAtBottomFunc(s, data);
        s.push(val);//push again the removed values in the same order 

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to push at bottom :");
        int a=sc.nextInt();
        pushAtBottomFunc(s,a);
        sc.close();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        }
        
    }
    

