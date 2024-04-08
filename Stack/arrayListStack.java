package Stack;
import java.util.*;
//stack implementation using ArrayList
public  class arrayListStack {
    //isEmpty();
    //push();
    //pop();
    //peek();===>to get element at top
    static ArrayList<Integer> list=new ArrayList<>();
    public static boolean isEmpty(){
        if(list.size()==0){
            return true;

        }
        return false;
    }
    public  void push(int data){
        list.add(data);
    }
    public  int pop(){
        int top=list.get(list.size()-1);
        return list.remove(top);
        
    }
    public  int peek(){
        return list.get(list.size()-1);

    }
    public  void print(){
        for (int i = list.size()-1; i >=0; i--) {
            System.out.println("| "+list.get(i)+" |");
            System.out.println("-----");
            
        }
    }
    public static void main(String[] args) {
        arrayListStack ss=new arrayListStack();
        ss.push(0);
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.print();
        
        System.out.println("Element on the top of the stack is :"+ss.peek());
        while(!isEmpty()){
            System.out.print(" "+ss.peek()+" ");
            ss.pop();
        }

    
    
}
}
