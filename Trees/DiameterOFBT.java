package Trees;
public class DiameterOFBT {
    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;  // Reset before each call
        height(root);
        return diameter;
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        int leftH = height(root.left);
        int rightH = height(root.right);

        diameter = Math.max(diameter, leftH + rightH);
        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        // Example: Build tree [1,2,3,4,5]
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));

        System.out.println("Diameter: " + diameterOfBinaryTree(root)); // Output: 3
    }
}

// TreeNode definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

