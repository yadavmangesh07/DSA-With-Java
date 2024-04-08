package Stack;

public class linkedListStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class llStack{
        static Node head=null;
        public boolean isEmpty(){
            if(head==null){
                return true;

            }
            return false;
        }
        public void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;

            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            int val=head.data;
            head=head.next;
            return val;

            
        }
        public int peek(){
            int val=head.data;
            return val;
        }
        

    }
    public static void main(String[] args) {
    llStack lls=new llStack();
    lls.push(0);        
    lls.push(1);        
    lls.push(2);        
    lls.push(3);        
    lls.push(4);        
    lls.push(5);        
    lls.push(6);
    while (!lls.isEmpty()) {
        System.out.println(lls.peek());
        lls.pop();
        
    }        
    
}
}
