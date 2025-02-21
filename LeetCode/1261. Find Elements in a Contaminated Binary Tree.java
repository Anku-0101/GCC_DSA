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
class FindElements {
    HashSet<Integer> nodes = new HashSet<>();

    public FindElements(TreeNode root) {
        if(root != null){
            root.val = 0;
            nodes.add(root.val);
        }
        recoverTree(root);
    }
    
    private void recoverTree(TreeNode root){
        if(root== null || (root.left == null && root.right == null)){
            return;
        }
        if(root.left != null){
            root.left.val = root.val*2+1;
            nodes.add(root.left.val);
            recoverTree(root.left);
        }
        if(root.right != null){
            root.right.val = root.val*2+2;
            nodes.add(root.right.val);
            recoverTree(root.right);
        }
    }

    public boolean find(int target) {
        return nodes.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
