package Stack;
import java.util.Scanner;

class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top < capacity - 1) {
            stack[++top] = x;
        } 
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class ImplementStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        MyStack stack = new MyStack(t); 
        sc.nextLine(); 

        for (int i = 0; i < t; i++) {
            String operation = sc.nextLine();
            if (operation.startsWith("push")) {
                int x = Integer.parseInt(operation.split(" ")[1]);
                stack.push(x);
            } else if (operation.equals("pop")) { 
                int result = stack.pop();
                if (result == -1) {
                    System.out.println("Empty");
                } else {
                    System.out.println(result);
                }
            }
        }
        sc.close();
    }
}


