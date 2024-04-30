package Trees2;

public class kthAnscestor {
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
    public static int isKthAnsector(Node root,int kth,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=isKthAnsector(root.left, kth,n);
        int right=isKthAnsector(root.right, kth,n);
        if(left==-1 && right==-1){
            return -1;
        }
        //otherwise find the max of left,right-->the negative will automatically be eliminated
        int max=Math.max(left, right);//we believe that either of left or right have the valid value
        if(max+1==kth){//match for kth level
            System.out.println(root.data);//return node data
        }
        return max+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(69);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.print("Ansector Node :");
       isKthAnsector(root, 1,69);//2nd ansector of 5 is 1
    //    System.out.println(isKthAnsector(root, 5, 5));
       
    }
    
    
}
