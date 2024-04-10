package Queue;

public class linkedListQueue {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static class Queue{
        static Node head=null;
        static Node tail=null;
        public boolean isEmpty(){
            if(head==null && tail==null){
                return true;

            }
            return false;
        }
    
    public void add(int val){
        Node newNode= new Node(val);
        if(isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        if(head==tail){
            int tempVal=head.data;
            head=tail=null;
            return tempVal;
        }
        int result=head.data;
        head=head.next;
        return result;

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        return head.data;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node current=head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
}
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.remove();
        
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
        
        
        
        
        
    
        
    }
}
    
}
