package Trees;

public  class diameterOfTree2 {
    static class  TreeNode {
        int data;
        TreeNode right,left;
        TreeNode(int data){
            this.data=data;
            right=null;
            left=null;
        }
        
        
    }   
    static class info {
        int diam;
        int ht;
        info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;

        }
    
        
    } 
    public static info diameterOfBinaryTree(TreeNode root) {
        if (root==null) {
            return new info(0, 0);
            
        }
        info lftInfo=diameterOfBinaryTree(root.left);
        info rghtInfo=diameterOfBinaryTree(root.right);
        int diam=Math.max(Math.max(lftInfo.diam,rghtInfo.diam),lftInfo.ht+rghtInfo.ht+1);
        int ht=Math.max(lftInfo.ht,rghtInfo.ht)+1;
        return new info(diam, ht);

    }
        public static void main(String[] args) {
           
            TreeNode root = new TreeNode(1);
            root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
            System.out.println(diameterOfBinaryTree(root).diam);
        }
    }
    
    

