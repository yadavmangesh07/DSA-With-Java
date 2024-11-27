package Trees;
import java.util.*;

public class levelOrderTraversal {
    public static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    
        
    }
    public static class binaryTree{
        int indx=-1;
        public Node buildBinaryTree(int preorder[]){
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
    public static void levelTraversal(Node root){
        //if want to count no. of nodes in the tree
        
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();//we will be adding node int the queue
        q.add(root);//add the root node
        q.add(null);//add null-->aim is to get next line (levelwise)
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();//print new line after every null removal
                if(q.isEmpty()){
                    break;//do nothing
                 }
                else{
                    q.add(null);//adding null again for future nextline

                }
            }
            else{
                System.out.print(curr.data+" ");
                if (curr.left!=null) {
                    q.add(curr.left);
                    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }



        }

    }
    public static void main(String[] args) {
        // int []arr={7,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // binaryTree tree=new binaryTree();
        // Node root=tree.buildBinaryTree(arr);
        // levelTraversal(root);
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10L);
        pq.add(20L);
        pq.add(30L);
        pq.add(40L);
        pq.add(50L);
        System.out.println(pq);
        
    }
    
}
