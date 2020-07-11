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
        int left = Math.max(getMaxRootSum(root.left),0);//�ڵ�ĺ�С��0 ������ ����Ϊ0
        int right = Math.max(getMaxRootSum(root.right),0);////�ڵ�ĺ�С��0 ������ ����Ϊ0
        maxRootSum = Math.max(maxRootSum,root.val+left+right);//ÿ�κ����ֵ���жԱȣ��������ֵ
        return root.val + Math.max(left,right);////��ǰ�ڵ�����ֵ������ߺ��ұߵ����ֵ���ϵ�ǰ�ڵ�
    }
}