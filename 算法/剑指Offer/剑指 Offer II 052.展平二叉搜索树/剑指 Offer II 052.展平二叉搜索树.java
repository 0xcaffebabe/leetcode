/*
 * @lc app=leetcode.cn id=剑指 Offer II 052 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 052] 展平二叉搜索树
 * 
 * 37/37 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 69.79 % of java submissions (39 MB)
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
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        TreeNode ret = new TreeNode();
        TreeNode origin = ret;
        for(int i=0;i<list.size();i++){
            ret.val = list.get(i);
            if (i == list.size() -1) break;
            ret.right = new TreeNode();
            ret = ret.right;
        }
        return origin;
    }
    private void travel(TreeNode root, List<Integer> list){
        if (root == null) return;
        travel(root.left, list);
        list.add(root.val);
        travel(root.right, list);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,3,6,2,4,null,8,1,null,null,null,7,9]\n
// @lcpr case=end

// @lcpr case=start
// [5,1,7]\n
// @lcpr case=end

 */

