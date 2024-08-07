package Trees;

public class countNodes {
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
    public static int countNode(Node root){
        if(root==null){
            return 0;

        }
        int leftNode=countNode(root.left);
        int rightNode=countNode(root.right);

        return leftNode+rightNode+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(countNode(root));
    }
    
}
