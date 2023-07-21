/*
 * @lc app=leetcode.cn id=剑指 Offer II 049 lang=typescript
 * @lcpr version=21910
 *
 * [剑指 Offer II 049] 从根节点到叶节点的路径数字之和
 * 
 * 108/108 cases passed (72 ms)
 * Your runtime beats 48.15 % of typescript submissions
 * Your memory usage beats 59.26 % of typescript submissions (43.9 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function sumNumbers(root: TreeNode | null): number {
  let ans = 0
  function travel(root: TreeNode | null, prev: number) {
    if (!root) return
    let s = prev * 10 + root.val
    if (!root.left && !root.right) {
      ans += s
    } else {
      travel(root.left, s);
      travel(root.right, s);
    }
  }
  travel(root, 0)
  return ans
};
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,9,0,5,1]\n
// @lcpr case=end

 */

