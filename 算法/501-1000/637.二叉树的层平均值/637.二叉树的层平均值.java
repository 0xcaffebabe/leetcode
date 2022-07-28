/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
 * 
 * 66/66 cases passed (3 ms)
 * Your runtime beats 23.36 % of java submissions
 * Your memory usage beats 43.5 % of java submissions (42.9 MB)
 */

// @lc code=start
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
    private List<List<Integer>> tmp = new ArrayList<>(32);

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>(32);
        travel(root, 0);
        for(int i = 0; i < tmp.size(); i++) {
            var item = tmp.get(i);
            Double sum = 0d;
            for(int j = 0; j < item.size(); j ++) sum += item.get(j);
            ans.add(sum / item.size());
        }
        return ans;
    }

    private void travel(TreeNode root, int level){
        if (root == null) return;
        if (tmp.size() - 1 < level) tmp.add(new ArrayList());
        
        tmp.get(level).add(root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

