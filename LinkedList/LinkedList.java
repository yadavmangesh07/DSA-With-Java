package LinkedList;

// import java.util.Arrays;

public class LinkedList {
    //initializing the node class
    public static class Node {
        
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //defining head ,tail and static variable size to track the size of linkedList
        public static Node head;
        public static Node tail;
        public static int size;
    //function to add elements in list at first
        public void addAtFirst(int data ){
            Node newNode= new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
            //function to add elements in list at last
        public void addAtLast(int data){//static can be added but not mandatory
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;

            }
            tail.next=newNode;
            tail=newNode;
            
        }
        public void printLinkedList(){//time complexity is O(n)
            Node temp=head;
            if(temp==null){
                System.out.println("LinkedList is Empty");
                return;
            }
            while(temp!=null){

                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void addAtIndex(int i,int data){
            if(i==0){
                addAtFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            Node temp=head;
            int index=0;
            
            while(index<i-1){
                temp=temp.next;
                index++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            
        }
        //to remove the first element form the ll
        public void removeFirst(){
            if(size==0){
                System.out.println("LinkedList is Empty");
                return;
            }
            else if(size==1){
                head=tail=null;
                size=0;
                return;
            }
            head=head.next;
            size--;
        }
        //to remove the last element from the linkedlist
        public void removeLast(){
            if(size==0){
                System.out.println("LinkedList is Empty");
                return;
            }
            else if (size==1) {
                head=tail=null;
                return;   
            }
            Node previous=head;
            for (int i = 0; i < size-2; i++) {
                previous=previous.next;
                
            }
            previous.next=null;
            tail=previous;
            size--;

        }
        public void searchElement(int num){
            if(size==0){
                System.out.println("ll is empty");
                return;
            }
            Node temp=head;
            for (int i = 0; i < size; i++) {
                if(temp.data==num){
                    System.out.println("Element found at index :"+i);
                    return;
                }
                temp=temp.next;
                
            }
            System.out.println("Element not exist in the LinkedList");
            return;
        }
        public int  recursiveSearch(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){//key at head
                return 0;
            }
            if(recursiveSearch(head.next,key)==-1){//the recursive search function was unable to  found the index
                    return -1;

            }
            return recursiveSearch(head.next, key)+1;//the function doesnt contains the original head

        }
        //reversing a ll
        public void reverse(){
            Node previous=null;
            Node next;
            Node current=tail=head;
            while(current!=null){
                next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            }
            head=previous;
        }
        public void deleteNthFromEnd(int n){
            if(n==size){//that means the first node i.e is head
                head=head.next;
                return;
                
            }
            int i=1;//index
            int indexToFind=size-n;//formula to get that position wrt index from starting
            Node temp=head;
            while(i<indexToFind){//reaching the previous node of the node which is to be deleted
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            return;

        }
        public boolean palindrome(){//linear time comp but O(n)space which is not a constant space
            int arr[]=new int[size];
            Node temp=head;
            for (int i = 0; i < size; i++) {
                arr[i]=temp.data;
                temp=temp.next;
                
            }
            for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
                if(arr[i]!=arr[j]){
                    return false;

                }
                
            }
            return true;
        }
        //to check palindrome in constant space

        //slow-fast approach to find middle node (helper function)
        public Node middleNode(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;//1 step
                fast=fast.next.next;//2 step
            }
            return slow;
        }
        public boolean checkPalindrome(){
            if(head==null || head.next==null){
                return true;

            }
            Node mid=middleNode(head);
            //to reverse the 2nd half 
            Node prev=null;
            Node curr=mid;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev;//prev is the head of right half of ll now
            Node left=head;
            while (right!=null) {
                if(right.data!=left.data){
                    return false;
                }
                right=right.next;
                left=left.next;
                
            }
            return true;
        }
        public boolean hasCycle(Node head) {
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }
        public int detectCycleIndex(Node head) {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){//cycle detected
                    break;
                }
            }
            if(fast==null || fast.next==null){//if no cycle exists in the ll
                return -1;
            }
            
            slow=head;//reintializing slow to head and fast is still at the node where fast==slow(Note:the distance of the cycle node from fast and head will always be equal mathematically)
            while(slow!=fast){
                slow=slow.next;
                
                fast=fast.next;
                
            }
            //due to 1step increment  slow and fast both are  on the cycle node
            return cycleIndex(slow);
            
        }
        public int cycleIndex(Node temp){//func to determine the index of the cycle point node
            Node temp2=head;
            int val=temp.data;
            int i=0;
            while(temp2!=null){
                if(temp2.data==val){
                    return i;
                    

                }
                temp2=temp2.next;
                i++;
            }
            return -1;

        }
        //mergeSort on ll
        public Node mergeSort(Node head){
            //base case
            if(head==null || head.next==null){
                return head;
            }
            //to find mid
            Node middle=getMid(head);

            //righthalf and lefthalf
            Node rightHead=middle.next;
            middle.next=null;//break connection of right and left half
            Node newLeft=mergeSort(head);//lefthalf starts form head
            Node newRight=mergeSort(rightHead);
            //After the  sorting both the halves are completed ,its time to merge them
            return merge(newLeft,newRight);

        } 
        private Node merge(Node head1,Node head2) {
            Node mergedList=new Node(-1);
            Node temp=mergedList;
            while(head2!=null && head1!=null){
                if(head1.data>=head2.data){
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
              
                }
                else{
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;

                }
            }
            //for remaining elements
            while(head1!=null){
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;

            }
            while(head2!=null){
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;

            }
            
            return mergedList.next;//becoz head of mergedList is -1

        }


     private Node getMid(Node head2) {
            Node fast=head2.next;//to get last node as middle node of the left-half
            Node slow=head2;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            return slow;//mid node

        }

        //zig-zag linkedList
        //Approach:
        //1)find the mid of the ll(i.e last of left-half)==>getMid function is already created
        //2)reverse the righthalf
        //3)alternate merging
        public void zigZag(Node head){
            Node midNode=getMid(head);
            Node righthead=reverseForZigZag(midNode);
            Node lefthead=head;
            //alternate merging
            Node nextright;
            Node nextleft;
            while(righthead!=null && lefthead!=null){
                nextleft=lefthead.next;
                lefthead.next=righthead;
                nextright=righthead.next;
                righthead.next=nextleft;
                //update
                lefthead=nextleft;
                righthead=nextright;
                
            }
            
           



        }
        public Node reverseForZigZag(Node mid){
            Node prev=null;
            Node curr=mid.next;
            mid.next=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            
            return prev;
        }
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();
            
            // head=new Node(1);
            // head.next=new Node(2);
            // head.next.next=new Node(3);
            // head.next.next.next=new Node(4);
            // head.next.next.next.next=head.next;
            
            ll.addAtLast(7);
            ll.addAtLast(6);
            ll.addAtLast(5);
            ll.addAtLast(4);
            ll.addAtLast(3);
            ll.addAtLast(2);
            ll.addAtLast(1);
            ll.addAtFirst(8);
           
            ll.printLinkedList();
            ll.zigZag(head);
            ll.printLinkedList();
            
            
            

            
           
            
           
        }
    }

    
    

