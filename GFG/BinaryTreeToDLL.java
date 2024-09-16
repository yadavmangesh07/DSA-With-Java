package GFG;

import java.util.ArrayList;

public class BinaryTreeToDLL {
    class Node {
        Node left, right;
        int data;

        Node(int d) {
            data = d;
            left = right = null;
        }

    }

    // This function should return head to the DLL

    class Solution {
        // Function to convert binary tree to doubly linked list and return it.
        Node bToDLL(Node root) {
            // Your code here
            ArrayList<Integer> ls = new ArrayList<>();
            inorder(root, ls);
            if (ls.size() == 0)
                return null;
            Node head = new Node(ls.get(0));

            Node prev = head;
            for (int i = 1; i < ls.size(); i++) {
                Node curr = new Node(ls.get(i));

                curr.left = prev;

                prev.right = curr;

                prev = curr;
            }
            prev.right = null;

            return head;
        }

        public static void inorder(Node root, ArrayList<Integer> ls) {
            if (root == null) {
                return;
            }
            inorder(root.left, ls);
            ls.add(root.data);
            inorder(root.right, ls);
        }
    }

}
