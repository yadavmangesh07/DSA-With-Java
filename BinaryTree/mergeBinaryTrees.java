package BinaryTree;
import java.util.ArrayList;

public class mergeBinaryTrees {
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
            // ls.add(null);
            return;
        }
        inorder(root.left);
        ls.add(root.data);
        inorder(root.right);

    }
    public static Node merge(Node root1,Node root2){
       if(root1==null && root2==null){
        return null;
       }
       if(root1!=null){
        return root2;
         
       }
       
       if(root2!=null){
        return root1;
         
       }
       @SuppressWarnings("null")
    Node mergeNode=new Node(root1.data+root2.data);
       mergeNode.right=merge(root1.right,root2.right);
       mergeNode.left=merge(root1.left,root2.left);
       return mergeNode;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.left.left=new Node(5);
        root.right=new Node(2);


        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.left.right=new Node(4);
        root1.right=new Node(3);
        root1.right.right=new Node(7);

        ;
        inorder(merge(root1, root));
        for (Integer a : ls) {
            System.out.print(a+" ");
            
        }
        

    }
    
}
