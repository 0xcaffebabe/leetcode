/*
 * @lc app=leetcode.cn id=剑指 Offer 32 - III lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 32 - III] 从上到下打印二叉树 III
 * 
 * 34/34 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 99.15 % of java submissions (40.8 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    private List<LinkedList<Integer>> ans = new ArrayList<>(16);
    public List levelOrder(TreeNode root) {
        travel(root, 0);
        return ans;
    }

    private void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() <= level) ans.add(new LinkedList<>());
        if (level % 2 == 0) ans.get(level).addLast(root.val);
        else ans.get(level).addFirst(root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

/*
// @lcpr case=start
// [3,9,20,null,null,15,7,1,4,6,3]\n
// @lcpr case=end

 */

