package BinarySearchTree;

public class deleteNodeBST {
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
    public static Node deleteNode(Node root,int key){
        if (root==null) {
            return null;
            
        }
        if(root.data<key){
            root.right=deleteNode(root.right, key);
        }
        else if(root.data>key){
            root.left=deleteNode(root.left, key);
        }
        else{
            //case1-->leaf node
            // if(root.left==null && root.right==null){
            //     root=null;
            //     return root;
            // }
            //case2-->single child
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right; 
            }
            //case3 --->both child
            Node IS=findInOrderSuccessor(root.right);//inorder successsor always lies in the leftmost node of the right subtree
            root.data=IS.data;//swapping values
            deleteNode(root.right, IS.data); //deleting inorder successor form right Subtree
            

        }
        return root;


    }
    private static Node findInOrderSuccessor(Node root) {
        while(root.left!=null){//root itself can be null becoz it has been already checked in the deleteNode Function
            root=root.left;
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);
        root.left.left=new Node(3);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.left.right=new Node(6);
        //tree
//                                  8   
//                                 / \
//                                5   10
//                               / \    \
//                              3   6    11
//                             / \         \
//                            1   4         14
      
       inorder(root);
       System.out.println();
       root=deleteNode(root, 10);
       inorder(root);
        
    }
    
    
}
