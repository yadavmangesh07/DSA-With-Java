package Trees;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;

class secondMinNode {
    public static class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<>();
        traverse(root, ls);
       Collections.sort(ls);
       if(ls.size()>1){
        for(int i=ls.size()-1;i>=0;i++){
            if(ls.get(i-1)<ls.get(i)){
                return ls.get(i-1);
            }
        }
       }
       else{
        return ls.get(0);
       }
       return -1;
       
    }
    public static void traverse(TreeNode root,ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.val);
        traverse(root.left,ls);
        traverse(root.right,ls);


    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right=new TreeNode(0);
        // root.left.left=new TreeNode(4);
        // root.left.right=new TreeNode(5);
        // root.right.left=new TreeNode(6);
        // root.right.right=new TreeNode(7);
        System.out.println(findSecondMinimumValue(root));
    }
}
