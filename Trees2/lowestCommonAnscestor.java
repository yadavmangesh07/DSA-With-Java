package Trees2;
//time-->O(N) with extra space

import java.util.ArrayList;

public class lowestCommonAnscestor {
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
    public static boolean getPath(Node root,int n,ArrayList<Node>ls){
        if(root==null){
            return false;
        }
        ls.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundAtLeft=getPath(root.left, n, ls);
        boolean foundAtRight=getPath(root.right, n, ls);
        if (foundAtRight||foundAtLeft) {
            return true;
            
        }
        ls.remove(ls.size()-1);//remove the last added node if foundAtRight and foundAtLeft both are false
        return false;
    }
    public static Node lcaNode(Node root,int a,int b){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        getPath(root, a, path1);//path :root to a
        getPath(root, b, path2);//path :root to b
        int i=0;
        for (; i < path1.size() && i<path2.size(); i++) {
            if(path1.get(i)!=path2.get(i)){
                break;
            }
            
        }
        //the upper loop breaks at i where value at i in both list are !equal
        return path1.get(i-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        // root.right.left=new Node(6);
        root.right.right=new Node(6);
        System.out.println(lcaNode(root, 4, 5).data);
    }
    
}
