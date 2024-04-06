package BinarySearchTree2;

public class isValidBST {
    public static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            right=null;
            left=null;
        }
    }
    public static boolean isValid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);

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
        System.out.println(isValid(root, null, null));
    }
    
}
