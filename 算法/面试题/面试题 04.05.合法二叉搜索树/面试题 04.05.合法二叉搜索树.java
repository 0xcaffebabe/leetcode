/*
 * @lc app=leetcode.cn id=面试题 04.05 lang=java
 * @lcpr version=21908
 *
 * [面试题 04.05] 合法二叉搜索树
 * 
 * 75/75 cases passed (2 ms)
 * Your runtime beats 25.16 % of java submissions
 * Your memory usage beats 13.62 % of java submissions (42.7 MB)
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
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        travel(root);
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }
    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        list.add(root.val);
        travel(root.right);
    }
}
// @lc code=end


/*

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

// @lcpr case=start
// [-2147483648]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,0,4,null,2,null,null,1]\n
// @lcpr case=end

 */