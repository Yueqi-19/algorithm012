/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


// 非递归 迭代法
// class Solution{
//     public List<Integer> preorder(Node root) {
// 	        LinkedList<Node> stack = new LinkedList<>();
// 	        LinkedList<Integer> output = new LinkedList<>();
// 	        if (root == null) {
// 	            return output;
// 	        }

// 	        stack.add(root);
// 	        while (!stack.isEmpty()) {
// 	            Node node = stack.pollLast();
// 	            output.add(node.val);
// 	            if (node.children != null) {
// 	            	Collections.reverse(node.children);
// 		            for (Node item : node.children) {
// 		                stack.add(item);
// 		            }
// 	            }
	            
// 	        }
// 	        return output;
// 	    }
// }

//递归法
class Solution{
    public List <Integer> preorder(Node root){
        List<Integer> res = new ArrayList<>();
        if(root ==null){
            return res;
        }
        helper(root,res);
        return res;
    }
    private void helper(Node root,List<Integer> res){
        if(root ==null){
            return;
        }
        res.add(root.val);
        for (Node node : root.children){
            helper(node,res);
        }
    }
}