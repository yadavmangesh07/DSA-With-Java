package Trees2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class topViewOfTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static class info{
        Node node;
        int hd;
        info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        HashMap<Integer,Node> map=new HashMap<>();
        Queue<info> q=new LinkedList<>();
        //initializing min ,max to print the hashmap in future
        int min=0;
        int max=0;
        //will perform level order traversal from here
        info obj=new info(root, 0);
        q.add(obj);
        q.add(null);
        while(!q.isEmpty()){
            info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
                 
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                //for left child and note that the value of min will only be effected by the left child
                if (curr.node.left!=null) {
                    q.add(new info(curr.node.left,curr.hd-1));
                    min=Math.min(min, curr.hd-1);
                    
                }
                //for right child and note that the value of max will only be effected by the right child
    
                if (curr.node.right!=null) {
                    q.add(new info(curr.node.right,curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                    
                }
            }
        }
        //to print the top view
        for (int i = min; i <=max; i++) {
            System.out.print(map.get(i).data+" ");
            
        }

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
        topView(root);
    }
}
