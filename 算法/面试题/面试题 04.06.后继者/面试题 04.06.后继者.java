/*
 * @lc app=leetcode.cn id=面试题 04.06 lang=java
 * @lcpr version=21908
 *
 * [面试题 04.06] 后继者
 * 
 * 24/24 cases passed (4 ms)
 * Your runtime beats 34.56 % of java submissions
 * Your memory usage beats 15.38 % of java submissions (42.9 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        travel(root);
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == p) return list.get(i);
        }
        return null;
    }
    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        list.add(root);
        travel(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n1\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,null,1]\n6\n
// @lcpr case=end

 */

