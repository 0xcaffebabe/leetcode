/*
 * @lc app=leetcode.cn id=剑指 Offer 26 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 26] 树的子结构
 * 
 * 48/48 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 63.98 % of java submissions (43.6 MB)
 */

// @lc code=start
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return check(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }
    boolean check(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        return A.val == B.val &&
                 check(A.left, B.left) && check(A.right, B.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n[3,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,5,1,2]\n[4,1]\n
// @lcpr case=end

 */

