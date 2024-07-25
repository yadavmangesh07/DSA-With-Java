package Queue;

import java.util.Scanner;

public class ImplementNode {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head;

        public Queue() {
            this.head = null;
        }

        public void delete() {
            if (head == null) {
                System.out.println("Empty");
                return;
            } else {
                int temp = head.data;
                head = head.next;
                System.out.println(temp);
            }
        }

        public void insert(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            if (s.startsWith("Enqueue")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                queue.insert(num);
            } else if (s.startsWith("Dequeue")) {
                queue.delete();
            }
            t--;
        }
        sc.close();
    }
}
