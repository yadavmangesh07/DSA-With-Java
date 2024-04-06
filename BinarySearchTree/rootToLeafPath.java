package BinarySearchTree;

import java.util.ArrayList;

public class rootToLeafPath {
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
    public static void rootToLeaf(Node root,ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.data);
        if(root.left==null && root.right==null){
            printPath(ls);

        }
        rootToLeaf(root.left, ls);
        rootToLeaf(root.right, ls);
        ls.remove(ls.size()-1);//root.left and root.right data will be removed while backtracking and only root node will be remaining which will be at the last index of the arrayList
    }
    private static void printPath(ArrayList<Integer> ls) {
        for (Integer integer : ls) {
            System.out.print(integer+"->");
            
        }
        System.out.println("Null");
        
    }
    public static void main(String[] args) {
            ArrayList<Integer> ls=new ArrayList<>();
      
            Node root=new Node(8);
            root.left=new Node(5);
            root.right=new Node(10);
            root.right.right=new Node(11);
            root.right.right.right=new Node(14);
            root.left.left=new Node(3);
            root.left.left.left=new Node(1);
            root.left.left.right=new Node(4);
            root.left.right=new Node(6);
            //tree
    //                                  8   
    //                                 / \
    //                                5   10
    //                               / \    \
    //                              3   6    11
    //                             / \         \
    //                            1   4         14
            rootToLeaf(root, ls);
    }
    
}
