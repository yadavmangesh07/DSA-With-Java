package BinarySearchTree2;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;

public class mergeTwoBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }
    public static ArrayList<Integer> ls=new ArrayList<>();
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        ls.add(root.data);
        inorder(root.right);

    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        ls.add(root.data);

    }
    public static void buildBalancedBST(){
        Collections.sort(ls);
        Node root=helper(0, ls.size()-1);
        ls.clear();
        postOrder(root);

    }
    public static Node helper(int s,int e){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        Node root=new Node(ls.get(mid));
        root.left=helper( s, mid-1);
        root.right=helper( mid+1, e);
        return root;
    }
    public static void main(String[] args) {
        Node tree1=new Node(2);
        tree1.left=new Node(1);
        tree1.right=new Node(4);


        Node tree2=new Node(9);
        tree2.left=new Node(3);
        tree2.right=new Node(12);

       inorder(tree2);
       inorder(tree1);
       buildBalancedBST();
    for (int i : ls) {
        System.out.print(i+" ");
    }

       

        
    }
    
}
