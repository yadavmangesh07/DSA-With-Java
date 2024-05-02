package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class maxSumLevel {
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
    public static int maxSumAtLevel(Node root){
        if(root==null){
            return 0;
        }
        int maxSum=Integer.MIN_VALUE;
        int tempSum=0;
        int maxLevel=1;
        int level=1;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    if (tempSum > maxSum) {
                        maxSum = tempSum;
                        maxLevel = level; // Update the level with the maximum sum
                    }
                    tempSum = 0;
                    q.add(null);
                    level++;

                }

            }
            else{
                tempSum+=curr.data;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }



            }
        }
        if(tempSum>maxSum){
            maxLevel=level;
        }
        return maxLevel;
        

    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right=new Node(0);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(maxSumAtLevel(root));
    }
}

