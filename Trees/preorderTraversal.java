package Trees;

// import java.util.ArrayList;

public class preorderTraversal {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

        public static class binaryTree {
            public void preorderTraversal(Node root) {
                if (root == null) {
                    return;
                }
                System.out.print(root.data + " ");
                preorderTraversal(root.left);
                preorderTraversal(root.right);

                //for inorder first print left sub tree->root->right sub tree
                //for postorder first print left sub tree-> right sub tree-> root

            }

        
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
            tree.preorderTraversal(root);
            
           
    
        }
    }



