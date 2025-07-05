class TreeNode {
    int data;
    TreeNode left, right;
    boolean leftThread, rightThread;

    public TreeNode(int item) {
        data = item;
        left = right = null;
        leftThread = rightThread = false;
    }
}

public class DoubleThreadedBinaryTree {
    TreeNode root;

    public DoubleThreadedBinaryTree() {
        root = null;
    }

    // FunctionExample to insert a new node in Double Threaded Binary Tree
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while (true) {
            parent = current;
            if (data < current.data) {
                if (!current.leftThread) {
                    current = current.left;
                } else {
                    newNode.left = current.left;
                    newNode.right = current;
                    current.left = newNode;
                    current.leftThread = false;
                    return;
                }
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    newNode.right = current;
                    newNode.rightThread = true;
                    return;
                }
                current = current.right;
            }
        }
    }

    // FunctionExample to perform inorder traversal of Double Threaded Binary Tree
    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        TreeNode current = leftMost(root);
        while (current != null) {
            System.out.print(current.data + " ");
            if (current.rightThread)
                current = current.right;
            else
                current = leftMost(current.right);
        }
    }

    // Helper function to find the leftmost node in the subtree rooted at a given node
    private TreeNode leftMost(TreeNode node) {
        if (node == null)
            return null;
        while (node.left != null)
            node = node.left;
        return node;
    }

    public static void main(String[] args) {
        DoubleThreadedBinaryTree tree = new DoubleThreadedBinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(8);
        tree.insert(30);
        System.out.println("Inorder traversal of double threaded binary tree:");
        tree.inorder();
    }
}
