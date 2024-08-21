public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

//    Tree - traversal :
//    Inorder : left first , root , right
//    Preorder : root, left , right
//    Postorder : left, right , root

    public static void main(String[] args) {
        TreeNode myTree = new TreeNode(10);

        myTree.left = new TreeNode(20);

        myTree.right = new TreeNode(30);
        myTree.right.left = new TreeNode(40);
        myTree.right.right = new TreeNode(50);

        levelorder(myTree);
        System.out.println(getSize(myTree));

    }

    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }

    }

    public static void postorder(TreeNode root) {
        if (root != null) {
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public static void kNode(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.value + " ");
        } else {

            kNode(root.left, k - 1);
            kNode(root.right, k - 1);
        }

    }

    public static void levelorder(TreeNode root) {
        int h = height(root);
        int k = 0;
        while (k <= h) {
            kNode(root, k);
            k++;
        }
    }

    public static int getSize(TreeNode root) {
        if (root == null) return 0;
        return 1 + getSize(root.left) + getSize(root.right);
    }

}
