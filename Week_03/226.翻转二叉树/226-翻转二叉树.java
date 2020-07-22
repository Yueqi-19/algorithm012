/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //Recursive 
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         //terminate condition
//         if(root == null){
//             return null;
//         }
//         // swape present Left & Right TreeNode
//         TreeNode temp = root.right;
//         root.right = root.left;
//         root.left = temp;
//         // recursive swape present left node
//         invertTree(root.left);
//         // recursive swape present right node
//         invertTree(root.right); 
//         return root;

//     }
// }


// iterate
class Solution{
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;//not a temp.left 
            if(temp.left !=null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }
        }
        return root;
    }
}
