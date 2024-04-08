package LinkedList;

public class doublyll {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        
    }
    public void printdll(){
        Node temp=head;
        // System.out.print("null<-");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("dll is empty");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("dll is empty");
            return;
        }
        if(head.next==null){
            head=tail=null;
            return;
        }
        Node temp=head;
        for (int i = 0; i < size-2; i++) {
            temp=temp.next;

            
        }
        temp.next=null;
        tail=temp;
        size--;

        

    }
    public void reversedll(){
        if(head.next==null){
            return;
        }
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next ;

        }
        tail=head;
        head=prev;
    }
    public void makeCircular(){
        if(head==null){
            System.out.println("dll is empty");
            return;
        }
        head.prev=tail;
        tail.next=head;
        
    }
    public static void main(String[] args) {
        doublyll dll=new doublyll();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printdll();
        dll.reversedll();
        dll.printdll();
        dll.makeCircular();
        dll.printdll();
    }
}
