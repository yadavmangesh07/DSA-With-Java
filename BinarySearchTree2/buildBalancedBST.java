package BinarySearchTree2;

public class buildBalancedBST {
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
    //Approach-->sorted array is =>inorder traversal of bst,and we have to balance the tree as well therefore find mid assign it as root and add all the elements left to the mid to leftsubtree and all the elements on right of mid to the right subtree
    public static Node buildTree(int s,int e,int []arr){
        if(s>e){
            return null;
        }
        int mid=s+(e-s)/2;
        Node root= new Node(arr[mid]);
        root.left=buildTree(s, mid-1, arr);
        root.right=buildTree(mid+1, e, arr);
        return root;

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
        int arr[]={3,5,6,8,10,11,12};
        int s=0;
        int e=arr.length-1;
        preorder(buildTree(s, e, arr));//called buildTree which returned a node --> root and then root is passed as formal paramter to preorder;
    }
    
}
