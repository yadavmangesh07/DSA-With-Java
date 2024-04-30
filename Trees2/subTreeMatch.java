package Trees2;

public class subTreeMatch {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    public static boolean matchSubTree(Node root, Node subTreeRootNode) {
        if (root == null) {
            return false;
        }
        if (root.data == subTreeRootNode.data) {
            if (isIdentical(root, subTreeRootNode)) {
                return true;
            }
        }
        return matchSubTree(root.left, subTreeRootNode) || matchSubTree(root.right, subTreeRootNode);
    }

    private static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        else if (root1 == null || root2 == null || root1.data != root2.data) {
            return false;
        }
        if(!isIdentical(root1.left, root2.left)){
            return false;
        }
        if(!isIdentical(root1.right, root2.right)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Main tree
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        // Subtree
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        System.out.println(matchSubTree(root, subRoot));
    }
}
