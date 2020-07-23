/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // solution 1 not good

// public class Solution {
//   public TreeNode lowestCommonAncestor(TreeNode root,TreeNode one, TreeNode two) {
//     if (root == one || root == two || root == null) {
//       return root;
//     }
//     TreeNode findLeft = lowestCommonAncestor(root.left, one, two);
//     TreeNode findRight = lowestCommonAncestor(root.right, one, two);
//     if (findLeft != null && findRight != null) {
//       return root;
//     }
//     return findLeft == null ? findRight : findLeft;
//   }
// }

// better solution 2

// class Solution {

//     private TreeNode ans;

//     public Solution() {
//         this.ans = null;
//     }

//     private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null) return false;
//         boolean lson = dfs(root.left, p, q);
//         boolean rson = dfs(root.right, p, q);
//         if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
//             ans = root;
//         } 
//         return lson || rson || (root.val == p.val || root.val == q.val);
//     }

//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         this.dfs(root, p, q);
//         return this.ans;
//     }
// }

// solution 3
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null || root == p || root == q) return root;
//         TreeNode left = lowestCommonAncestor(root.left, p, q);
//         TreeNode right = lowestCommonAncestor(root.right, p, q);
//         if(left == null && right == null) return null; // 1.
//         if(left == null) return right; // 3.
//         if(right == null) return left; // 4.
//         return root; // 2. if(left != null and right != null)
//     }
// }


// class Solution{
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if (root == null || p == root || q == root) return root;
//         TreeNode left = lowestCommonAncestor(root.left, p, q);
//         TreeNode right = lowestCommonAncestor(root.right, p, q);
//         return left == null ? right : right == null ? left : root;
//     }
// }

class Solution{
     public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p , TreeNode q){
     	if(root == null || p == root || q==root){ // 1st step
            return root;
        }
        // 2nd step
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right , p, q);
        // 3rd step
        if (left == null && right == null){
                return null;
        }
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        } else {
            return root;
        }
    }
}
