package Trees2;

public class printKthLevel {
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
    public static void printLevelNode(Node root,int level,int targetLevel){
        if(root==null){//if no subtrees exists
            return;
        }
        if(level==targetLevel){//if target level is reached
            System.out.print(root.data+" ");
            return;
        }
        printLevelNode(root.left, level+1, targetLevel);//call for left subtree
        printLevelNode(root.right, level+1, targetLevel);//call for right subtree
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right=new Node(0);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        printLevelNode(root, 1, 3);
    }
}
