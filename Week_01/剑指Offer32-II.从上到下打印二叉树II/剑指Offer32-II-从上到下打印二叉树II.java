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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
        return res;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level =new ArrayList<>();
            for (int i = 0; i< size; i++){
                TreeNode curr = q.poll();
                if (curr.left != null){
                    q.offer(curr.left);
                }
                if (curr.right != null){
                    q.offer(curr.right);
                }
                level.add (curr.val);
            }
            res.add(level);
        }
        return res;
    }
}