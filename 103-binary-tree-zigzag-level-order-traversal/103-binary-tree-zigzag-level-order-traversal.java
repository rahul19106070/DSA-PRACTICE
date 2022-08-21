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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null) return ans;
        q.add(root);
        // ans.push(root);
        int count=0;
        while(q.size()!=0){
            int n=q.size();
           List<Integer> li=new ArrayList<Integer>();

           // if(count%2==0){
               for(int i=0;i<n;i++){
                   TreeNode temp=q.peek();
                   q.poll();

                   li.add(temp.val);
                   if(temp.left!=null) q.add(temp.left);
                   if(temp.right!=null) q.add(temp.right);
 
               }
            if(count!=0){
                Collections.reverse(li);
             }
             ans.add(li);
            
           
        count^=1;
        // ans.add(li);
        }
        
    return ans;    
    }
    
}