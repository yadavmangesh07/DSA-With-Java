package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            if (s.startsWith("push_back")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                dq.addLast(num);
            } else if (s.startsWith("push_front")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                dq.addFirst(num);
            } else if (s.startsWith("pop_front")) {
                if (dq.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    System.out.println(dq.pollFirst());
                }
            } else if (s.startsWith("pop_back")) {
                if (dq.isEmpty()) {
                    System.out.println("Empty");
                } else {
                    System.out.println(dq.pollLast());
                }
            }
        }
        sc.close();

    }
}
