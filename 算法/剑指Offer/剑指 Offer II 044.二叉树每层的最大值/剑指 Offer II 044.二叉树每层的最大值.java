/*
 * @lc app=leetcode.cn id=剑指 Offer II 044 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer II 044] 二叉树每层的最大值
 * 
 * 78/78 cases passed (1 ms)
 * Your runtime beats 97.63 % of java submissions
 * Your memory usage beats 5 % of java submissions (43.2 MB)
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
    List<Integer> ans = new ArrayList<>(16);
    public List<Integer> largestValues(TreeNode root) {
        travel(root, 0);
        return ans;
    }
    void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() - 1 < level) ans.add(Integer.MIN_VALUE);
        if (root.val > ans.get(level)) ans.set(level, root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,2,5,3,null,9]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

