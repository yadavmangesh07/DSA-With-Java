package Trees;

public class heightOfBinaryTree {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            right=null;
            left=null;
        }

    
        
    }
    public static int findHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=findHeight(root.left);
        // System.out.println(root.data);
        int rightHeight=findHeight(root.right);
        int height=Math.max(leftHeight, rightHeight)+1;
        return height;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        // root.left.right.left=new Node(69);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(findHeight(root));

    }
    
}
