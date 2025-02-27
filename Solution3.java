//Time complexity: O(N), where N is the number of nodes.
//Space complexity: O(H), where H is the maximum height of the tree.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
 
class Solution3 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left!=null && right != null) {
            return root;
        }
        else if(left != null) {
            return left; 
        }
        else if(right != null) {
            return right; 
        }
        else {
            return null;
        }
    }
}