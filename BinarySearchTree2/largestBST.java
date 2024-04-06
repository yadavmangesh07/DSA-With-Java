package BinarySearchTree2;

public class largestBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }
    public static int maxBSTSize=0;//to track the size of largest valid BST
    
    //Info class to track the info mentioned in the class form each subtree form left and right
    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.max=max;
            this.min=min;
            this.size=size;
        }
    
        
    }
    public static Info largestBSTSize(Node root){
        //termination condition
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        //first of all calculate the info form left and right subtree
        Info leftInfo=largestBSTSize(root.left);
        Info rightInfo=largestBSTSize(root.right);
        

        //build our own info
        int size=leftInfo.size+rightInfo.size+1;//since we r on the root
        int max=Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        int min=Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        
        //analyzing each info
        if(root.data<=leftInfo.max || root.data >=rightInfo.min){
            return new Info(false, size, min, max);
        }
        if (leftInfo.isBST && rightInfo.isBST) {
            //since is the valid codition ,therefor we need to update maxSize
            maxBSTSize=Math.max(maxBSTSize,size);
            return new Info(true, size, min, max);
            
        }
        return new Info(false, size, min, max);
        
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        largestBSTSize(root);
        System.out.println("Largest BST Size is: "+maxBSTSize);
    }
}
