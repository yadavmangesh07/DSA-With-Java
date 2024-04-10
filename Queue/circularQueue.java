package Queue;
//approach is that we will delete the fornt element from the array
public class circularQueue {
    public static class Queue{
         static int []arr;
         static int size;
         static int rear;
         static int front;
        Queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }
    public boolean isEmpty(){
        if(front==-1){
            return true;

        }
        return false;
    }
    public boolean isFull(){
        return (rear+1)%size==front;
    }
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){//case of empty queue
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;


    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        int val=arr[front];
        if(rear==front){//last element to be deleted
            front=rear=-1;
        }
        else{

            front=(front+1)%size;//formula to shift rear to starting empty space of array
        }
        return val;

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        return arr[front];
    }
    public void print(){
        while(!isEmpty()){
            System.out.print(peek()+" ");
            remove();
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Queue cq=new Queue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        

    }
    
}
