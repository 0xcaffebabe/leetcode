/*
 * @lc app=leetcode.cn id=2583 lang=java
 * @lcpr version=21907
 *
 * [2583] 二叉树中的第 K 大层和
 * 
 * 45/45 cases passed (42 ms)
 * Your runtime beats 25.82 % of java submissions
 * Your memory usage beats 9.72 % of java submissions (75.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    List<Long> list = new ArrayList<>();
    public long kthLargestLevelSum(TreeNode root, int k) {
        dfs(root, 1);
        if (list.size() < k) return -1;
        list.sort(Collections.reverseOrder(Long::compareTo));
        return list.get(k - 1);
    }

    void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (list.size() < level) list.add(0L);
        list.set(level - 1, list.get(level - 1) + root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,8,9,2,1,3,7,4,6]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,null,3]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n
// @lcpr case=end

 */

