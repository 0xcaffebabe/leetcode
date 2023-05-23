/*
 * @lc app=leetcode.cn id=面试题 04.02 lang=java
 * @lcpr version=21908
 *
 * [面试题 04.02] 最小高度树
 * 
 * 32/32 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 17.05 % of java submissions (42.1 MB)
 */

// @lc code=start


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return dfs(new TreeNode(0), 0, nums.length - 1);
    }
    TreeNode dfs(TreeNode root, int start, int end) {
        if (end >= nums.length) return null;
        if (start > end) return null;
        int mid = (start + end) / 2;
        root.val = nums[mid];
        root.left = dfs(new TreeNode(0), start, mid - 1);
        root.right = dfs(new TreeNode(0), mid + 1, end);
        return root;
    }
}
// @lc code=end


/*

// @lcpr case=start
// [2,1,3,5,4,6,9,8,7,0]\n
// @lcpr case=end

*/
