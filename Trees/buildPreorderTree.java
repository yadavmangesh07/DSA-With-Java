package Trees;

public class buildPreorderTree {
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
    public static class binaryTree{
        static int indx=-1;
        public  Node buildBinaryTree(int []preorder){
            indx++;
            
            if(preorder[indx]==-1){
                return null;
            }
            Node newNode=new Node(preorder[indx]);
            //creating left subtree
            newNode.left=buildBinaryTree(preorder);
            newNode.right=buildBinaryTree(preorder);
            return newNode;            
              

        }
        

    }
    public static void main(String[] args) {
        int []arr={7,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildBinaryTree(arr);
        System.out.println(root.data);

    }
    
}
