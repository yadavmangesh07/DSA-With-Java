package Trees;

public class nodeSum {
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
    public static int SumNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSum=SumNodes(root.left);
        int rightSum=SumNodes(root.right);
        return leftSum+rightSum+root.val;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        System.out.println(SumNodes(root));
    }
    
}
