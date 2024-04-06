package BinarySearchTree;

import java.util.ArrayList;

public class mirrorBST {
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
    public static ArrayList<Integer> ls=new ArrayList<>();
    public static void reverseInorder(Node root,ArrayList<Integer>ls){
        if(root==null){
            return;
        }
        
        reverseInorder(root.right, ls);
        ls.add(root.data);
        reverseInorder(root.left,ls);
        

    }
    public static void helper(Node root){
        
        for (int i = 0; i < ls.size(); i++) {
            root=buildBST(root, i);
            
            
        }
        for (Integer integer : ls) {
            System.out.print(integer+" ");
            
        }
        

    }
    public static Node buildBST(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
            
        }
        if(root.data>val){
            root.left=buildBST(root.left, val);
        }
        else{
            root.left=buildBST(root.left, val);

        }
        return root;

    }
    
    public static void main(String[] args) {
            
      
            Node root=new Node(8);
            root.left=new Node(5);
            root.right=new Node(10);
            root.right.right=new Node(11);
            // root.right.right.right=new Node(14);
            root.left.left=new Node(3);
            // root.left.left.left=new Node(1);
            // root.left.left.right=new Node(4);
            root.left.right=new Node(6);
            //tree
    //                                  8   
    //                                 / \
    //                                5   10
    //                               / \    \
    //                              3   6    11
    //                             / \         \
    //                            1   4         14
            reverseInorder(root, ls);
            helper(root);
           }
    
}
