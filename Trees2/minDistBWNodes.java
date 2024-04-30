package Trees2;

public class minDistBWNodes {
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
    public static int minDist(Node root,int q,int r){
        // Node lca=lcaII(root, r, q);//find the lowest common ansector node
        int dist1=lcaDist(root,r);
        int dist2=lcaDist(root,q);
        int result=dist1+dist2;//1 added becoz we r standing on the root node
        return result;
    }
    private static int lcaDist(Node root, int q) {
        if(root==null){
            return -1;
        }
        if(root.data==q){
            return 0;
        }
        int lftDist=lcaDist(root.left, q);
        int rghtDist=lcaDist(root.right, q);

        //who so ever from lftDist ,rghtDist has returned a valid value
        if(lftDist==-1 && rghtDist==-1){
            return -1;
        }
        else if (lftDist==-1) {
            return rghtDist+1;//1 added becoz we r standing on the root node
            
        }
        else{
            return lftDist+1;//1 added becoz we r standing on the root node
        }
    }
    public static Node lcaII(Node root,int p,int q){
        if(root==null || root.data==p || root.data==q){
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
        System.out.println(minDist(root, 4, 6));
    }
    
}
