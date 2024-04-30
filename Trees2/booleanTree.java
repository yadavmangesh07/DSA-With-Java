package Trees2;

public class booleanTree {
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
    public static boolean booleanEvaluation(Node root){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.data==1){
                return true;
            }
            else{
                return false;
            }
        }
        boolean lft=booleanEvaluation(root.left);
        boolean rgt=booleanEvaluation(root.right);
        switch (root.data) {
            case 2:
                
                return lft || rgt;
        
            case 3:
                return lft && rgt;
        }
        return false;
    }
public static void main(String[] args) {
    Node root=new Node(2);
    root.left=new Node(0);
    root.right=new Node(3);
    root.right.left=new Node(0);
    root.right.right=new Node(1);
    System.out.println(booleanEvaluation(root));
}
}
