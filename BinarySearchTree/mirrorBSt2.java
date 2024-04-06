package BinarySearchTree;


public class mirrorBSt2 {
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
    public static Node mirrorBST(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=mirrorBST(root.left);
        Node rightMirror=mirrorBST(root.right);
        //swapping leftMirror and RightMirror;
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
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
  
            mirrorBST(root);
            preorder(root);
            
           }
    
}
