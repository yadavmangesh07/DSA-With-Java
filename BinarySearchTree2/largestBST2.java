package BinarySearchTree2;

public class largestBST2 {
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
    public static class Info {
        boolean isBST;
        int size;
        int max;
        int min;
        static int maxBSTSize = 0;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int largestBST(Node root) {
        helper(root);
        return Info.maxBSTSize;
    }

    public static Info helper(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info lftInfo = helper(root.left);
        Info rgtInfo = helper(root.right);

        if (lftInfo.isBST && rgtInfo.isBST && root.data > lftInfo.max && root.data < rgtInfo.min) {
            int size = lftInfo.size + rgtInfo.size + 1;
            Info.maxBSTSize = Math.max(Info.maxBSTSize, size);
            int min = Math.min(root.data, lftInfo.min);
            int max = Math.max(root.data, rgtInfo.max);
            return new Info(true, size, min, max);
        } else {
            return new Info(false, 0, 0, 0);
        }
    }


    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(4);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);
        helper(root);
        System.out.println("Largest BST Size is: "+Info.maxBSTSize);
    }

    
}
