package Trees;

public class diameterOFTree {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int diameter(Node node){
        if(node==null){
            return 0;
        }
        int leftDiam=diameter(node.left);
        int leftHeight=height(node.left);
        int rightDiam=diameter(node.right);
        int rightHeight=height(node.right);
        int selfDiam=leftHeight+rightHeight+1;
        return Math.max(selfDiam,Math.max(rightDiam, leftDiam));
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter(root));
    }
    
}
