/*
 * @lc app=leetcode.cn id=LCP 44 lang=java
 * @lcpr version=
 *
 * [LCP 44] 开幕式焰火
 * 
 * 64/64 cases passed (1 ms)
 * Your runtime beats 96.67 % of java submissions
 * Your memory usage beats 58.09 % of java submissions (42 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

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
    Set<Integer> set = new HashSet<>();
    public int numColor(TreeNode root) {
        dfs(root);
        return set.size();
    }
    void dfs(TreeNode root) {
        if (root == null) return;
        set.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,2,1,null,2]\n
// [3,3,3]\n
// @lcpr case=end

// @lcpr case=start
// @lcpr case=end

 */

