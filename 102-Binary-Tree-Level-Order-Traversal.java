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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        
        List <List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>(List.of(root));

        while(!q.isEmpty()){
            List<Integer> currLevel=new ArrayList<>();
            for(int i=q.size();i>0;i--){
                TreeNode node=q.poll();
                currLevel.add(node.val);
                if(node.left !=null)
                q.offer(node.left);
                if(node.right !=null)
                q.offer(node.right);
            }
            ans.add(currLevel);
        }
        return ans;
    }
}