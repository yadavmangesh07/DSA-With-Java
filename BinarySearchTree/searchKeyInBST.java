package BinarySearchTree;

// import Trees2.booleanTree;

public class searchKeyInBST {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }

    }
    public static boolean searchKey(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            boolean lft=searchKey(root.left, key);
            return lft;
        }
        else{
            return searchKey(root.right, key);
        }
        
    }
    public static void main(String[] args) {
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
//         
        System.out.println(searchKey(root, 19));
    }
    
}
