package Stack;

public class arrayStack {
    private static int size;
    private static int arr[];
    private static int top=-1;
    arrayStack(int size){
        arrayStack.size=size;
        arrayStack.arr=new int[size];
    }
    //isEmpty()
    //isFull()
    //push()
    //pop()
    //peek()
    public  boolean isEmpty(){
        return top==-1?true:false;
    }
    public  boolean isFull(){
        return top==size-1?true:false;
    }
    public  void push(int data){
       
        
            top++;
            arr[top]=data;
        
    }
    public  int  pop(){
        if(top!=-1){
            int popped=arr[top];
            top--;
            return popped;
        }
       return -1;
    }
    public  void  peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println(arr[top]);

        
    }
    public  void print(){
        for (int i=top;i>=0;i--) {
            System.out.println("| "+arr[i]+" |");
            System.out.println("-----");
            
        }
    }
    public static void main(String[] args) {
        
        arrayStack as=new arrayStack(8);
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.print();
        System.out.println("===========");
        as.pop();
        as.print();
        System.out.println(as.isEmpty());
        as.peek();
      
    }

    
}
