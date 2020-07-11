/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxRootSum = Integer.MIN_VALUE; 
    public int maxPathSum(TreeNode root) {
        getMaxRootSum(root);
        return maxRootSum;
    }
    private int getMaxRootSum(TreeNode root){
        if (root == null)return 0;
        int left = Math.max(getMaxRootSum(root.left),0);//节点的和小于0 则舍弃 重置为0
        int right = Math.max(getMaxRootSum(root.right),0);////节点的和小于0 则舍弃 重置为0
        maxRootSum = Math.max(maxRootSum,root.val+left+right);//每次和最大值进行对比，保存最大值
        return root.val + Math.max(left,right);////当前节点的最大值等于左边和右边的最大值加上当前节点
    }
}