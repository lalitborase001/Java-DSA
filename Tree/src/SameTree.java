import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode node = p;
        TreeNode nod = q;
        if(node == null && nod == null) return true;
        if(node == null ||  nod == null ) return false;
        if(node.val != nod.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}