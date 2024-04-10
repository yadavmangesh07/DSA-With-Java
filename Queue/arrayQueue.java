package Queue;

// import StackProblems.stackUsingJCF;

public class arrayQueue {
    public static class queue{
        static int arr[];
        static int size;
        static int rear;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
    
    public  boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    public void add(int data){
        if(rear==size-1){//array full
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
        

    }
    
    public int remove(){//O(n)
        if(isEmpty()){
            System.out.println("queue is empty");
            return-1;
        }
        int front=arr[0];
        for (int i = 0; i <rear; i++) {
            arr[i]=arr[i+1];
            
        }

        rear--;
        
        return front;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return-1;
        }
        return arr[0];
    }
    public  void printQ(){
        for (int i = 0; i <=rear; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue qu=new queue(5);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.printQ();
        System.out.println(qu.peek());
       

    }
}
    
}
