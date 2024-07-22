package LinkedList;

public class DoubleLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node addFirst(Node head,int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return head;

        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }
    public static Node addLast(Node head,int val){
        if(head==null){
            return addFirst(head, val);
            
        }
        Node temp=head;
        Node newNode=new Node(val);
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=null;
        return head;
    }

    public static Node addAtPosition(Node head,int data,int Position){
        if(head==null){
            System.out.println("List is empty");
            return null;
        }
        if(Position<1){
            System.out.println("Invalid Position");
            return head;

        }
        if(Position==1){
           
         return addFirst(head, data);
           
        }
      
        Node temp=head;
        for (int i = 1; i < Position-1; i++) {
            temp=temp.next;
            if(temp==null){
                System.out.println("Position out of bound");
                return head;
            }
        }
        if(temp.next==null){
            return addLast(head, data);
        }
        else{
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.next.prev=newNode;
            newNode.prev=temp;
            temp.next=newNode;
        }
        return head;
        

    }

    public static Node deleteAtFirst(Node head){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        head=head.next;
        return head;
    }

    public static Node deleteAtLast(Node head){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
        return head;
    }
    
    public static Node deleteAtPosition(Node head,int Position){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        if(Position<1){
            System.out.println("Invalid position");
            return head;
        }
        if(Position==1){
            return deleteAtFirst(head);
        }
        Node temp=head;
        for (int i = 1; i < Position-1; i++) {
            temp=temp.next;

            
        }
        temp.next=temp.next.next;
        return head;
    }


    public static void display(Node head){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node head=null;
        head=addFirst(head, 10);
        head=addFirst(head, 20);
        head=addFirst(head, 30);
        head=addFirst(head, 40);
        head=addFirst(head, 50);
        head=addFirst(head, 60);
        head=addFirst(head, 70);
        head=addFirst(head, 80);
        head=addFirst(head, 90);
        head=addFirst(head, 100);
        display(head);
        head=deleteAtPosition(head, 10);
        display(head);
        
        
    }
        
}
