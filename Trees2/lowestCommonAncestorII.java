package Trees2;
//time-->O(N) but no extra space
public class lowestCommonAncestorII {
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
    public static Node lcaII(Node root,Node p,Node q){
        if(root==null || root==p || root==q){
            return root;

        }
        Node inLeft=lcaII(root.left, p, q);
        Node inRight=lcaII(root.right, p, q);
        if(inLeft==null){
            return inRight;
        }
        else if (inRight==null) {
            return inLeft;
            
        }
        else
        {
            return root;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        // root.right.left=new Node(6);
        root.right.right=new Node(6);
        // System.out.println(lcaNode(root, 4, 5).data);
        System.out.println(lcaII(root, root.left.left, root.left.right).data);
    }
    
}
