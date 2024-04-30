package Trees2;

public class sumTree {
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
    public static int sumTreeNode(Node root){
        if(root==null){
            return 0;
        }
        int lft=sumTreeNode(root.left);
        int rt=sumTreeNode(root.right);
        int data=root.data;
        int newlft=root.left==null?0:root.left.data;
        int newrgt=root.right==null?0:root.right.data;
        root.data=newlft+newrgt+lft+rt;
        return data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(sumTreeNode(root));
        preorder(root);
    }
    
}
