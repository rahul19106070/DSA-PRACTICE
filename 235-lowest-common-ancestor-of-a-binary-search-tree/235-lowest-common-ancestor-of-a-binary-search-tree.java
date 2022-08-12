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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode temp=root;
        while(temp!=null){
            // if(temp==p || temp==q){
            //     return temp;
            // }
             if(p.val>temp.val && q.val>temp.val){
                temp=temp.right;
            }else if(p.val<temp.val && q.val<temp.val){
                temp=temp.left;
            }else{
                return temp;
            }
        }
        return null;
    }
}