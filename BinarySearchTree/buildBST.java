package BinarySearchTree;

import java.util.ArrayList;

public class buildBST {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }

    }

    public static Node BuildBSTree(int val, Node root) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // create new node in the left subtree and assign it to the root.left
            root.left = BuildBSTree(val, root.left);
        } else {
            // create new node in the right subtree and assign it to the root.right
            root.right = BuildBSTree(val, root.right);
        }
        return root;
    }

    public static void inorder(Node root, ArrayList<Integer> ls) {  
        if (root == null) {
            return;
        }
        inorder(root.left, ls);
        ls.add(root.data);
        inorder(root.right, ls);
    }

    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        int values[]={5,1,3,4,2,7};
        Node root=null;
    for (int i : values) {
        root=BuildBSTree(i, root);
        
    }
    inorder(root, ls);
    for (int i : ls) {
        System.out.print(i+" ");
        
    }
    }
}
