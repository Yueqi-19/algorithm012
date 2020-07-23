/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// solution 1
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         if (root == null || (root.left == null && root.right == null)){
//             return true;
//         }
//         return isValidOrder(root,-Double.MAX_VALUE,Double.MAX_VALUE);

//     }

//     private boolean isValidOrder(TreeNode root,Double min,Double max){
//         if(root == null){
//             return true;
//         }
//         if(root != null && root.val <= min){
//             return false;
//         }
//         if(root != null && root.val >= max){
//             return false;
//         }
//         return isValidOrder(root.left,min,Double.valueOf(root.val)) && isValidOrder(root.right,Double.valueOf(root.val),max);
//     }
// }

// solution 2
// class Solution {
//   public boolean helper(TreeNode node, Integer lower, Integer upper) {
//     if (node == null) return true;

//     int val = node.val;
//     if (lower != null && val <= lower) return false;
//     if (upper != null && val >= upper) return false;

//     if (! helper(node.right, val, upper)) return false;
//     if (! helper(node.left, lower, val)) return false;
//     return true;
//   }

//   public boolean isValidBST(TreeNode root) {
//     return helper(root, null, null);
//   }
// }

//solution 3
class Solution{
    public boolean isValidBST(TreeNode root){
        return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode root, long min , long max){
        if (root == null){
            return true;
        } 
        if (root.val <= min || root.val >= max){
            return false;
        }
        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
    }
}
